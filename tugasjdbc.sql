-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 22, 2022 at 09:30 AM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tugasjdbc`
--

-- --------------------------------------------------------

--
-- Table structure for table `dataakun`
--

CREATE TABLE `dataakun` (
  `id` int(11) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dataakun`
--

INSERT INTO `dataakun` (`id`, `Username`, `password`) VALUES
(1, 'abogoboga', '123200'),
(2, 'a', '123'),
(3, 'b', '123'),
(4, 'b', '123'),
(5, '[value-2]', '0'),
(6, '[value-2]', '[value-3]'),
(7, '[value-2]', '[value-3]'),
(8, 'q', 'a'),
(9, 'bb', 'b'),
(10, 'aaa', 'jPasswordField1'),
(11, 'aaab', 'bb');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dataakun`
--
ALTER TABLE `dataakun`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dataakun`
--
ALTER TABLE `dataakun`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
