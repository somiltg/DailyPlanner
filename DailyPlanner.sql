-- MySQL dump 10.13  Distrib 5.5.44, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: DailyPlanner
-- ------------------------------------------------------
-- Server version	5.5.44-0ubuntu0.14.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Note`
--

DROP TABLE IF EXISTS `Note`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Note` (
  `UName` varchar(50) DEFAULT NULL,
  `Topic` varchar(50) DEFAULT NULL,
  `DateTime` date DEFAULT NULL,
  `FilePath` varchar(300) DEFAULT NULL,
  `KeyWord1` varchar(50) DEFAULT NULL,
  `KeyWord2` varchar(50) DEFAULT NULL,
  `KeyWord3` varchar(50) DEFAULT NULL,
  `KeyWord4` varchar(50) DEFAULT NULL,
  `KeyWord5` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Note`
--

LOCK TABLES `Note` WRITE;
/*!40000 ALTER TABLE `Note` DISABLE KEYS */;
INSERT INTO `Note` VALUES ('somil','abc','2015-10-11','/home/prakhar/Desktop/somilabc.html','','','','',''),('prakhar','note','2015-10-11','/home/prakhar/Desktop/prakharnote.html','','','','',''),('gupt','bcsgh','2015-10-11','/home/prakhar/Desktop/guptbcsgh.html','a','b','c','d','e'),('gupt','abcd','2015-10-11','/home/prakhar/Desktop/guptabcd.html','','','','',''),('gupt','haghsg','2015-10-11','/home/prakhar/Desktop/gupthaghsg.html','','','','','');
/*!40000 ALTER TABLE `Note` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ToDo`
--

DROP TABLE IF EXISTS `ToDo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ToDo` (
  `UName` varchar(50) DEFAULT NULL,
  `Memo` varchar(200) DEFAULT NULL,
  `DateTime` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ToDo`
--

LOCK TABLES `ToDo` WRITE;
/*!40000 ALTER TABLE `ToDo` DISABLE KEYS */;
INSERT INTO `ToDo` VALUES ('prakhar','birthdaysex','2014-11-26');
/*!40000 ALTER TABLE `ToDo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Users`
--

DROP TABLE IF EXISTS `Users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Users` (
  `Name` varchar(50) DEFAULT NULL,
  `UName` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `FileStore` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Users`
--

LOCK TABLES `Users` WRITE;
/*!40000 ALTER TABLE `Users` DISABLE KEYS */;
INSERT INTO `Users` VALUES ('abc','abc','def','/home/prakhar/Desktop'),('somil','somil','kaali','/home/prakhar/Desktop'),('prakhar','prakhar','abc','/home/prakhar/Desktop'),('gupta','somil','wer',''),('gupt','somil','wer','/home/prakhar/Desktop');
/*!40000 ALTER TABLE `Users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-10-11 13:04:39
