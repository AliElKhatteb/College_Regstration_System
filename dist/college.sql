-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 03, 2015 at 02:51 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `college`
--

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE IF NOT EXISTS `student` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) DEFAULT NULL,
  `Age` int(11) DEFAULT NULL,
  `Gender` varchar(20) DEFAULT NULL,
  `Level` int(11) DEFAULT NULL,
  `Dept` varchar(20) DEFAULT NULL,
  `Grade` float DEFAULT NULL,
  `Ssn` int(11) DEFAULT NULL,
  `Course1` varchar(50) DEFAULT NULL,
  `Course2` varchar(50) DEFAULT NULL,
  `Course3` varchar(50) DEFAULT NULL,
  `Course4` varchar(50) DEFAULT NULL,
  `Course5` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=22 ;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`ID`, `Name`, `Age`, `Gender`, `Level`, `Dept`, `Grade`, `Ssn`, `Course1`, `Course2`, `Course3`, `Course4`, `Course5`) VALUES
(19, 'Ali Mohamed', 21, 'Male', 2, 'IS', 81, 1415397, 'Algorithm', 'Calcus1', 'C++', 'DataBase', 'Internet Technology'),
(20, 'NagyAdel', 19, 'Male', 2, 'IT', 70, 1415398, 'MobileApplication', 'LinearAlgebra', 'AnalysisAndDesignOfInformationSystem', 'E-Commerce', 'Wireless and Mobile Networks'),
(21, 'abdelkreem', 53, 'Male', 4, 'IT', 90, 1415399, 'InroductionToComputers', 'Logic Design', 'Java', 'E-Learning', 'Virtual Reality');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `UserName` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `ans` varchar(50) DEFAULT NULL,
  `question` varchar(50) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`UserName`, `Password`, `ans`, `question`, `id`) VALUES
('bis', 'bis', 'bread', 'What Do You Like To Eat?', 7);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
