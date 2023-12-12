-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: exemplo_senac2
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `filmes`
--

DROP TABLE IF EXISTS `filmes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `filmes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `dataLancamento` date NOT NULL,
  `categoria` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `filmes`
--

LOCK TABLES `filmes` WRITE;
/*!40000 ALTER TABLE `filmes` DISABLE KEYS */;
INSERT INTO `filmes` VALUES (1,'RAIN MAN','1989-02-01','DRAMA'),(2,'CIDADE DE DEUS','2023-01-01','AÇÃO'),(7,'OS VINGADORES','2002-02-02','AÇÃO'),(9,'VENTOS DA LIBERDADE','2011-02-03','DRAMA'),(11,'JAMAICA ABAIXO DE ZERO','1991-02-02','COMÉDIA'),(13,'PSICOPATA AMERICANO','1980-08-08','SUSPENSE'),(14,'O PLANO PERFEITO','2001-05-04','POLICIAL'),(18,'A ILHA DO MEDO','2004-03-04','SUSPENSE'),(19,'PRENDAM-ME SE FOR CAPAZ','1992-03-03','AÇÃ0'),(20,'FEITOS NA AMÉRICA','0200-05-07','AÇÃO'),(21,'LOUCADEMIA DE POLÍCIA','1989-04-04','COMÉDIA'),(22,'OS SIMPSONS','2009-08-07','COMÉDIA'),(23,'EU, EU MESMO E IRENE','2004-03-05','COMÉDIA'),(24,'JAMAICA ABAIXO DE 0','2000-02-02','COMEDIA');
/*!40000 ALTER TABLE `filmes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `podcast`
--

DROP TABLE IF EXISTS `podcast`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `podcast` (
  `id` int NOT NULL AUTO_INCREMENT,
  `produtor` varchar(50) NOT NULL,
  `nome_episodio` varchar(100) NOT NULL,
  `numero_episodio` varchar(6) NOT NULL,
  `duracao` varchar(8) NOT NULL,
  `url` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `podcast`
--

LOCK TABLES `podcast` WRITE;
/*!40000 ALTER TABLE `podcast` DISABLE KEYS */;
INSERT INTO `podcast` VALUES (1,'JOVEM PAN','ENTREVISTA COM BOLSONARO','01','02:34:00','www.youtube.com/jovempan_epidosio01'),(2,'FLOW','ENTREVISTA COM TIAGO BRAGA','01','02:15:14','www.youtube.com.br/flow_tiagobraga'),(5,'A DERIVA','ENTREVISTA COM RENATO TREIZOITÃO','1','02:02:02','www.youtube.com.br/aderiva_renatotrezoitao_01'),(6,'BRASIL PARALELO','OS PILARES DA CIVILIZAÇÃO OCIDENTAL','02','03:30:15','www.brasilparalelo.com.br/conversaparalela_civilizacao_ocidental'),(8,'MONARX TALKS','LIMITES DA LIBERDADE COM PAULO KOGOS','02','02:45:00','www.rumble.com/liberdade_kogos'),(9,'JOVEM PAN','QUEIMADA NO AMAZONAS COM RICARDO SALLES','03','03:00:00','www.youtube.com.br/jovempan_panico_salles'),(10,'MONARK TALKS','ENTREVISTA COM THOMAS GIULIANO','02','02:12:34','www.rumble.com/monark_thomas');
/*!40000 ALTER TABLE `podcast` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produtos`
--

DROP TABLE IF EXISTS `produtos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produtos` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `nome` text,
  `valor` int DEFAULT NULL,
  `status` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produtos`
--

LOCK TABLES `produtos` WRITE;
/*!40000 ALTER TABLE `produtos` DISABLE KEYS */;
INSERT INTO `produtos` VALUES (2,'PS4',1500,'Vendido'),(3,'Xbox 360',800,'Vendido'),(4,'Iphone 12',4800,'Vendido'),(5,'PS2',400,'A Venda');
/*!40000 ALTER TABLE `produtos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) DEFAULT NULL,
  `login` varchar(30) DEFAULT NULL,
  `senha` varchar(100) DEFAULT NULL,
  `tipo` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Davi','daviremzetti','e10adc3949ba59abbe56e057f20f883e','usuário'),(2,'Jamaica','jamaica','c33367701511b4f6020ec61ded352059','administrador'),(3,'savana','savana','e10adc3949ba59abbe56e057f20f883e','operador'),(4,'davi','davi','e10adc3949ba59abbe56e057f20f883e','administrador'),(5,'jamaica','jamaica','770105b98be2fdd6a6f096d29ca5632c','operador');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-12 16:54:31
