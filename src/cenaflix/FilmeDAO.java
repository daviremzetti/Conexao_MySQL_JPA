
package cenaflix;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 * Classe para conectar, consultar e manipular a tabela filmes no banco de dados
 * @author daviremzetti
 */
public class FilmeDAO {
    
    Connection conexao = null;
    PreparedStatement ps;
    ResultSet resultado;
    
   /**
    * Método para conectar o banco de dados
    * @return
    * @throws ClassNotFoundException
    * @throws SQLException 
    */
    public boolean conectar() throws ClassNotFoundException, SQLException{
        
        try{
            String url = "jdbc:mysql://localhost:3306/exemplo_senac2";
            String usuario = "root";
            String senha = "123456";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, usuario, senha);
            return true;
        }catch(ClassNotFoundException | SQLException e){
            return false;
        }
    }
    
    /**
     * Método para inserir filmes no banco de dados
     * @param novoFilme - filme a ser inserido
     * @return
     * @throws SQLException 
     */
    public boolean inserir(Filme novoFilme) throws SQLException{
        
        try{
            ps = conexao.prepareStatement("insert into filmes values(?,?,?,?)");
            ps.setInt(1, 0);
            ps.setString(2, novoFilme.getNome());
            ps.setDate(3, Date.valueOf(novoFilme.getLancamento()));
            ps.setString(4, novoFilme.getCategoria());

            ps.executeUpdate();
            
            return true;
        }catch(SQLException e){
            return false;
        }
        
    }
    
    /**
     * Método para editar filmes no banco de dados
     * @param id - id do filme
     * @param nome - nome do filme
     * @param datalancamento - data do lançamento do filme
     * @param categoria - categoria do filme
     * @return 
     */
    public boolean editar(int id, String nome, LocalDate datalancamento, String categoria){
        try{
            ps = conexao.prepareStatement("update filmes set nome = ?, datalancamento = ?, categoria = ? where id = ?");
            ps.setString(1, nome);
            ps.setDate(2, Date.valueOf(datalancamento));
            ps.setString(3, categoria);
            ps.setInt(4, id);
            ps.executeUpdate();
            return true;
            
        }catch(SQLException e){
            return false;
        }
    }
    
    /**
     * Método para deletar filmes no banco de dados
     * @param id - id do filme
     * @return 
     */
    public boolean deletar(int id){
        try{
            ps = conexao.prepareStatement("delete from filmes where id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
            
            return true;
            
        }catch(SQLException e){
            return false;
        }
    }
    
    public ArrayList<Filme> listar() throws SQLException{
        ArrayList<Filme> lista = new ArrayList<>();
        
        try{
            ps = conexao.prepareStatement("select * from filmes");
            resultado = ps.executeQuery();
            while(resultado.next()){
                int idFilme = resultado.getInt("id");
                String nomeFilme = resultado.getString("nome");
                String dataFilmeDB = String.valueOf(resultado.getDate("datalancamento"));
                LocalDate dataFilme = LocalDate.parse(dataFilmeDB);
                String categoriaFilme = resultado.getString("categoria");

                Filme novoFilme = new Filme(nomeFilme, dataFilme, categoriaFilme);
                novoFilme.setId(idFilme);
                lista.add(novoFilme);
            }
        } catch(SQLException e){
            return null;
        }
        return lista;
    }
    
    
    
    /**
     * Método para consultar filmes no banco de dados
     * @param nome - nome do filme ou partes do nome do filme
     * @return 
     */
    public Filme consultar(String nome){
        
        try{
            
            ps = conexao.prepareStatement("select * from filmes where nome like ?");
           
            ps.setString(1, "%" + nome + "%");
            resultado = ps.executeQuery();
            
            
            resultado.next();
            boolean encontrado = resultado.wasNull();
            if(encontrado == false){
                
                int idFilme = resultado.getInt("id");
                String nomeFilme = resultado.getString("nome");
                String dataFilmeDB = String.valueOf(resultado.getDate("datalancamento"));
                LocalDate dataFilme = LocalDate.parse(dataFilmeDB);
                String categoriaFilme = resultado.getString("categoria");

                Filme novoFilme = new Filme(nomeFilme, dataFilme, categoriaFilme);
                novoFilme.setId(idFilme);
            
                return novoFilme; 
            }
            else{
                
                return null;
            }
            
        }catch(SQLException e){
            return null;
        }catch(NullPointerException e){
            
            return null;
        }
    }
    
    
    /**
     * Método para desconectar o banco de dados
     * @return
     * @throws SQLException 
     */
    public boolean desconectar() throws SQLException{
        try{
            conexao.close();
            return true;
        }catch(SQLException e){
            return false;
        }
        
    }
}
