-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 26, 2023 at 05:56 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `database_lapangan`
--
CREATE DATABASE IF NOT EXISTS `database_lapangan` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `database_lapangan`;

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_admin` varchar(25) NOT NULL,
  `nama_admin` varchar(100) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `jenis_pekerjaan` enum('Owner','Admin') NOT NULL,
  `RFID` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_admin`, `nama_admin`, `username`, `password`, `jenis_pekerjaan`, `RFID`) VALUES
('A01', 'admin123', 'admin', 'admin', 'Admin', '2751999683'),
('A03', 'nensyah30', 'Ninis', 'nensyah30', 'Admin', '2751999683'),
('A04', 'Aisy', 'Aisy17', 'Aisy17', 'Admin', '4177187072'),
('P01', 'bagus', 'Bagus12345', 'bagus12345', 'Owner', '2751460371'),
('P02', 'Irfan45', 'Irfan', 'Irfan45', 'Owner', '2751460371'),
('P03', 'Owner', 'owner', 'owner', 'Owner', '');

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `id_booking` int(11) NOT NULL,
  `tanggal_booking` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `nama_penyewa` varchar(100) NOT NULL,
  `id_lapangan` varchar(100) NOT NULL,
  `tanggal_main` date NOT NULL,
  `jam_mulai` time NOT NULL,
  `jam_selesai` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`id_booking`, `tanggal_booking`, `nama_penyewa`, `id_lapangan`, `tanggal_main`, `jam_mulai`, `jam_selesai`) VALUES
(2, '2023-03-16 06:08:28', 'Lury', 'L01', '2023-03-16', '13:00:00', '14:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `detailtransaksimakanan`
--

CREATE TABLE `detailtransaksimakanan` (
  `iddetail` int(11) NOT NULL,
  `nonota` varchar(20) NOT NULL,
  `id_fd` int(11) NOT NULL,
  `qty` int(11) NOT NULL,
  `subtotal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `detailtransaksimakanan`
--

INSERT INTO `detailtransaksimakanan` (`iddetail`, `nonota`, `id_fd`, `qty`, `subtotal`) VALUES
(1, 'TSC220520230001', 1, 3, 9000),
(2, 'TSC230520230001', 1, 2, 6000),
(3, 'TSC230520230001', 3, 1, 4000),
(4, 'TSC230520230001', 5, 1, 15000),
(5, 'TSC230520230002', 6, 4, 16000),
(6, 'TSC230520230002', 3, 2, 8000),
(7, 'TSC230520230002', 1, 5, 15000),
(8, 'TSC230520230003', 7, 3, 10500),
(12, 'TSC230520230003', 1, 2, 2300),
(13, 'TSC230520230004', 3, 2, 5000),
(14, 'TSC230520230004', 6, 1, 4000),
(15, 'TSC230520230004', 9, 20, 60000),
(16, 'TSC230520230004', 3, 2, 5000),
(17, 'TSC230520230004', 6, 1, 4000),
(18, 'TSC230520230004', 9, 20, 60000),
(19, 'TSC250520230001', 3, 2, 5000);

--
-- Triggers `detailtransaksimakanan`
--
DELIMITER $$
CREATE TRIGGER `kurangStok` AFTER INSERT ON `detailtransaksimakanan` FOR EACH ROW UPDATE makanan
  SET stok = stok - NEW.qty
  WHERE id_fooddrink = NEW.id_fd
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `lapangan`
--

CREATE TABLE `lapangan` (
  `id_lapangan` varchar(25) NOT NULL,
  `nama_lapangan` varchar(25) NOT NULL,
  `deskripsi` text NOT NULL,
  `harga_lapangan` int(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `lapangan`
--

INSERT INTO `lapangan` (`id_lapangan`, `nama_lapangan`, `deskripsi`, `harga_lapangan`) VALUES
('L01', 'Husada', 'Bagus', 35000),
('L03', 'Maospati', 'Luas dan Nyaman', 70000),
('L04', 'Panji', 'Outdoor', 35000),
('L05', 'M2M', 'Bersih', 70000),
('L06', 'Al-Abiyadh', 'Indoor', 70000),
('L07', 'Prima Utama Jaya', 'Besar', 70000);

-- --------------------------------------------------------

--
-- Table structure for table `makanan`
--

CREATE TABLE `makanan` (
  `id_fooddrink` int(11) NOT NULL,
  `nama` varchar(150) NOT NULL,
  `harga` int(11) NOT NULL,
  `stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `makanan`
--

INSERT INTO `makanan` (`id_fooddrink`, `nama`, `harga`, `stok`) VALUES
(1, 'Es Teh', 3000, 45),
(3, 'Indomilk', 2500, 19),
(5, 'Aqua', 5000, 25),
(6, 'Mizone Cup', 4000, 28),
(7, 'Teh Pucuk ', 4000, 30),
(9, 'Lemper', 3000, -20);

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `id_member` int(11) NOT NULL,
  `nama_member` varchar(100) NOT NULL,
  `jam_mulai` time NOT NULL,
  `jam_selesai` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `pekerjaan`
--

CREATE TABLE `pekerjaan` (
  `id_pekerjaan` varchar(25) NOT NULL,
  `nama_pekerjaan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pekerjaan`
--

INSERT INTO `pekerjaan` (`id_pekerjaan`, `nama_pekerjaan`) VALUES
('P01', 'rebahan');

-- --------------------------------------------------------

--
-- Table structure for table `transaksilapangan`
--

CREATE TABLE `transaksilapangan` (
  `kode_booking` varchar(16) NOT NULL,
  `id_lapangan` varchar(100) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `nomerTelpon` varchar(15) NOT NULL,
  `tanggalBooking` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `tanggalMain` date NOT NULL,
  `jamMulai` time NOT NULL,
  `jamSelesai` time NOT NULL,
  `tarif` int(11) NOT NULL,
  `dp` int(11) NOT NULL,
  `status` enum('Booking','Lunas','Dibatalkan') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksilapangan`
--

INSERT INTO `transaksilapangan` (`kode_booking`, `id_lapangan`, `nama`, `nomerTelpon`, `tanggalBooking`, `tanggalMain`, `jamMulai`, `jamSelesai`, `tarif`, `dp`, `status`) VALUES
('TSC010420230001', 'L01', 'Lury', '0895322195063', '2023-05-02 06:29:54', '2023-05-02', '08:00:00', '09:00:00', 70000, 70000, 'Lunas'),
('TSC020420230002', 'L01', 'Lury', '0895322195063', '2023-05-02 06:30:45', '2023-05-02', '08:00:00', '12:00:00', 70000, 35000, 'Booking'),
('TSC090520230001', 'L02', 'Lury', '0895322195063', '2023-05-09 02:06:05', '2023-05-09', '10:00:00', '11:00:00', 70000, 70000, 'Booking'),
('TSC090520230002', 'L02', 'Lury', '0895322195063', '2023-05-15 02:07:16', '2023-05-09', '05:00:00', '06:00:00', 70000, 70000, 'Lunas'),
('TSC090520230003', 'L02', 'Lury', '0895322195063', '2023-05-23 02:41:45', '2023-05-09', '07:00:00', '08:00:00', 70000, 70000, 'Booking'),
('TSC150520230001', 'L02', 'mukidi', '09988888', '2023-05-15 02:25:45', '2023-05-09', '06:00:00', '07:00:00', 70000, 45000, 'Booking'),
('TSC150520230002', 'L01', 'mukidi', '09988888', '2023-05-15 02:39:50', '2023-05-09', '06:00:00', '07:00:00', 35000, 45000, 'Lunas'),
('TSC190520230001', 'L01', 'lury', '081354369671', '2023-05-22 04:57:38', '2023-05-19', '05:00:00', '06:00:00', 35000, 10000, 'Lunas'),
('TSC230520230001', 'L02', 'Lury', '08985322195063', '2023-05-23 01:00:14', '2023-05-23', '10:00:00', '11:00:00', 70000, 35000, 'Booking'),
('TSC230520230002', 'L02', 'Lury', '0895322195063', '2023-05-23 01:06:14', '2023-05-23', '08:00:00', '09:00:00', 70000, 70000, 'Lunas'),
('TSC230520230003', 'L03', 'Lury', '0895322195063', '2023-05-23 02:24:24', '2023-05-24', '09:00:00', '11:00:00', 140000, 70000, 'Booking'),
('TSC230520230004', 'L05', 'Irfan', '0859825192', '2023-05-23 06:40:41', '2023-05-03', '11:00:00', '14:00:00', 210000, 100000, 'Booking'),
('TSC230520230005', 'L06', 'Lury', '23904234234', '2023-05-25 06:04:33', '2023-05-25', '12:00:00', '13:00:00', 70000, 35000, 'Lunas'),
('TSC230520230006', 'L07', 'Irfan', '08953221063', '2023-05-23 06:46:52', '2023-05-23', '07:00:00', '10:00:00', 210000, 25000, 'Lunas'),
('TSC230520230007', 'L07', 'Bu Rani', '0895322195063', '2023-05-23 06:44:38', '2023-05-23', '07:00:00', '10:00:00', 210000, 210000, 'Lunas'),
('TSC230520230008', 'L07', 'Dulur', '097765644578', '2023-05-23 06:55:02', '2023-05-23', '11:00:00', '13:00:00', 140000, 10000, 'Dibatalkan'),
('TSC240520230001', 'L07', 'Lury', '0895322195063', '2023-05-24 13:36:05', '2023-05-24', '11:00:00', '12:00:00', 70000, 70000, 'Lunas');

-- --------------------------------------------------------

--
-- Table structure for table `transaksimakanan`
--

CREATE TABLE `transaksimakanan` (
  `nonota` varchar(20) NOT NULL,
  `totalHarga` int(11) NOT NULL,
  `tanggalTransaksiMakanan` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksimakanan`
--

INSERT INTO `transaksimakanan` (`nonota`, `totalHarga`, `tanggalTransaksiMakanan`) VALUES
('TSC220520230001', 9000, '2023-05-23 03:15:53'),
('TSC230520230001', 25000, '2023-05-23 03:15:53'),
('TSC230520230002', 39000, '2023-05-23 03:15:53'),
('TSC230520230003', 10500, '2023-05-23 05:42:49'),
('TSC230520230004', 69000, '2023-05-23 06:57:53'),
('TSC250520230001', 5000, '2023-05-25 06:04:16'),
('TSC27032023001', 20000, '2023-05-23 03:15:53');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`),
  ADD UNIQUE KEY `username` (`username`,`password`);

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`id_booking`),
  ADD KEY `id_lapangan` (`id_lapangan`);

--
-- Indexes for table `detailtransaksimakanan`
--
ALTER TABLE `detailtransaksimakanan`
  ADD PRIMARY KEY (`iddetail`),
  ADD KEY `nonota` (`nonota`),
  ADD KEY `id_fd` (`id_fd`);

--
-- Indexes for table `lapangan`
--
ALTER TABLE `lapangan`
  ADD PRIMARY KEY (`id_lapangan`);

--
-- Indexes for table `makanan`
--
ALTER TABLE `makanan`
  ADD PRIMARY KEY (`id_fooddrink`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`id_member`);

--
-- Indexes for table `pekerjaan`
--
ALTER TABLE `pekerjaan`
  ADD PRIMARY KEY (`id_pekerjaan`);

--
-- Indexes for table `transaksilapangan`
--
ALTER TABLE `transaksilapangan`
  ADD PRIMARY KEY (`kode_booking`),
  ADD KEY `id_lapangan` (`id_lapangan`);

--
-- Indexes for table `transaksimakanan`
--
ALTER TABLE `transaksimakanan`
  ADD PRIMARY KEY (`nonota`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `booking`
--
ALTER TABLE `booking`
  MODIFY `id_booking` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `detailtransaksimakanan`
--
ALTER TABLE `detailtransaksimakanan`
  MODIFY `iddetail` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `makanan`
--
ALTER TABLE `makanan`
  MODIFY `id_fooddrink` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `member`
--
ALTER TABLE `member`
  MODIFY `id_member` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `detailtransaksimakanan`
--
ALTER TABLE `detailtransaksimakanan`
  ADD CONSTRAINT `detailtransaksimakanan_ibfk_1` FOREIGN KEY (`id_fd`) REFERENCES `makanan` (`id_fooddrink`),
  ADD CONSTRAINT `detailtransaksimakanan_ibfk_2` FOREIGN KEY (`nonota`) REFERENCES `transaksimakanan` (`nonota`);
--
-- Database: `konsepbasisdata`
--
CREATE DATABASE IF NOT EXISTS `konsepbasisdata` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `konsepbasisdata`;

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa_tif`
--

CREATE TABLE `mahasiswa_tif` (
  `nim` int(11) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `prodi` varchar(100) DEFAULT NULL,
  `tanggallahir` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mahasiswa_tif`
--

INSERT INTO `mahasiswa_tif` (`nim`, `nama`, `prodi`, `tanggallahir`) VALUES
(41221567, 'Deli Kurniawati', 'TIF', '2003-12-31');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mahasiswa_tif`
--
ALTER TABLE `mahasiswa_tif`
  ADD PRIMARY KEY (`nim`);
--
-- Database: `mahasiswa`
--
CREATE DATABASE IF NOT EXISTS `mahasiswa` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `mahasiswa`;

-- --------------------------------------------------------

--
-- Table structure for table `akun`
--

CREATE TABLE `akun` (
  `nim` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `kode_buku` varchar(50) NOT NULL,
  `nama_buku` varchar(100) NOT NULL,
  `nama_penerbit` varchar(100) NOT NULL,
  `tahun_terbit` varchar(4) NOT NULL,
  `kode_qr` blob DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`kode_buku`, `nama_buku`, `nama_penerbit`, `tahun_terbit`, `kode_qr`) VALUES
('BOOK1234', 'PEMDAS', 'KEMENDIKBUDRISTEK', '2022', 0x5b424036333436616132);

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `nim` varchar(100) NOT NULL,
  `nama` varchar(200) DEFAULT NULL,
  `jurusan` varchar(200) DEFAULT NULL,
  `alamat` varchar(200) DEFAULT NULL,
  `phone` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `id_peminjaman` varchar(50) NOT NULL,
  `id_buku` varchar(50) NOT NULL,
  `id_mahasiswa` varchar(50) NOT NULL,
  `tanggal_peminjaman` date NOT NULL,
  `tanggal_pengembalian` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`kode_buku`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`id_peminjaman`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD CONSTRAINT `mahasiswa_ibfk_1` FOREIGN KEY (`nim`) REFERENCES `akun` (`nim`) ON DELETE CASCADE ON UPDATE CASCADE;
--
-- Database: `phpmyadmin`
--
CREATE DATABASE IF NOT EXISTS `phpmyadmin` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `phpmyadmin`;

-- --------------------------------------------------------

--
-- Table structure for table `pma__bookmark`
--

CREATE TABLE `pma__bookmark` (
  `id` int(10) UNSIGNED NOT NULL,
  `dbase` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `user` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `label` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `query` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Bookmarks';

-- --------------------------------------------------------

--
-- Table structure for table `pma__central_columns`
--

CREATE TABLE `pma__central_columns` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_type` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_length` text COLLATE utf8_bin DEFAULT NULL,
  `col_collation` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_isNull` tinyint(1) NOT NULL,
  `col_extra` varchar(255) COLLATE utf8_bin DEFAULT '',
  `col_default` text COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Central list of columns';

-- --------------------------------------------------------

--
-- Table structure for table `pma__column_info`
--

CREATE TABLE `pma__column_info` (
  `id` int(5) UNSIGNED NOT NULL,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `column_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `comment` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `mimetype` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `transformation` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `transformation_options` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `input_transformation` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `input_transformation_options` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Column information for phpMyAdmin';

-- --------------------------------------------------------

--
-- Table structure for table `pma__designer_settings`
--

CREATE TABLE `pma__designer_settings` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `settings_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Settings related to Designer';

-- --------------------------------------------------------

--
-- Table structure for table `pma__export_templates`
--

CREATE TABLE `pma__export_templates` (
  `id` int(5) UNSIGNED NOT NULL,
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `export_type` varchar(10) COLLATE utf8_bin NOT NULL,
  `template_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `template_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Saved export templates';

-- --------------------------------------------------------

--
-- Table structure for table `pma__favorite`
--

CREATE TABLE `pma__favorite` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `tables` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Favorite tables';

-- --------------------------------------------------------

--
-- Table structure for table `pma__history`
--

CREATE TABLE `pma__history` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `username` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `timevalue` timestamp NOT NULL DEFAULT current_timestamp(),
  `sqlquery` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='SQL history for phpMyAdmin';

-- --------------------------------------------------------

--
-- Table structure for table `pma__navigationhiding`
--

CREATE TABLE `pma__navigationhiding` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `item_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `item_type` varchar(64) COLLATE utf8_bin NOT NULL,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Hidden items of navigation tree';

-- --------------------------------------------------------

--
-- Table structure for table `pma__pdf_pages`
--

CREATE TABLE `pma__pdf_pages` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `page_nr` int(10) UNSIGNED NOT NULL,
  `page_descr` varchar(50) CHARACTER SET utf8 NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='PDF relation pages for phpMyAdmin';

-- --------------------------------------------------------

--
-- Table structure for table `pma__recent`
--

CREATE TABLE `pma__recent` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `tables` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Recently accessed tables';

--
-- Dumping data for table `pma__recent`
--

INSERT INTO `pma__recent` (`username`, `tables`) VALUES
('root', '[{\"db\":\"restoran_pujasera\",\"table\":\"tbl_job\"},{\"db\":\"restoran_pujasera\",\"table\":\"tbl_admin\"},{\"db\":\"restoran_pujasera\",\"table\":\"id_job\"},{\"db\":\"restoran_pujasera\",\"table\":\"tbl_transaksi\"},{\"db\":\"restoran_pujasera\",\"table\":\"tbl_fd\"}]');

-- --------------------------------------------------------

--
-- Table structure for table `pma__relation`
--

CREATE TABLE `pma__relation` (
  `master_db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `master_table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `master_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Relation table';

-- --------------------------------------------------------

--
-- Table structure for table `pma__savedsearches`
--

CREATE TABLE `pma__savedsearches` (
  `id` int(5) UNSIGNED NOT NULL,
  `username` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `search_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `search_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Saved searches';

-- --------------------------------------------------------

--
-- Table structure for table `pma__table_coords`
--

CREATE TABLE `pma__table_coords` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `pdf_page_number` int(11) NOT NULL DEFAULT 0,
  `x` float UNSIGNED NOT NULL DEFAULT 0,
  `y` float UNSIGNED NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Table coordinates for phpMyAdmin PDF output';

-- --------------------------------------------------------

--
-- Table structure for table `pma__table_info`
--

CREATE TABLE `pma__table_info` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `display_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Table information for phpMyAdmin';

-- --------------------------------------------------------

--
-- Table structure for table `pma__table_uiprefs`
--

CREATE TABLE `pma__table_uiprefs` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `prefs` text COLLATE utf8_bin NOT NULL,
  `last_update` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Tables'' UI preferences';

-- --------------------------------------------------------

--
-- Table structure for table `pma__tracking`
--

CREATE TABLE `pma__tracking` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `version` int(10) UNSIGNED NOT NULL,
  `date_created` datetime NOT NULL,
  `date_updated` datetime NOT NULL,
  `schema_snapshot` text COLLATE utf8_bin NOT NULL,
  `schema_sql` text COLLATE utf8_bin DEFAULT NULL,
  `data_sql` longtext COLLATE utf8_bin DEFAULT NULL,
  `tracking` set('UPDATE','REPLACE','INSERT','DELETE','TRUNCATE','CREATE DATABASE','ALTER DATABASE','DROP DATABASE','CREATE TABLE','ALTER TABLE','RENAME TABLE','DROP TABLE','CREATE INDEX','DROP INDEX','CREATE VIEW','ALTER VIEW','DROP VIEW') COLLATE utf8_bin DEFAULT NULL,
  `tracking_active` int(1) UNSIGNED NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Database changes tracking for phpMyAdmin';

-- --------------------------------------------------------

--
-- Table structure for table `pma__userconfig`
--

CREATE TABLE `pma__userconfig` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `timevalue` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `config_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='User preferences storage for phpMyAdmin';

--
-- Dumping data for table `pma__userconfig`
--

INSERT INTO `pma__userconfig` (`username`, `timevalue`, `config_data`) VALUES
('root', '2022-09-27 06:16:59', '{\"Console\\/Mode\":\"collapse\"}');

-- --------------------------------------------------------

--
-- Table structure for table `pma__usergroups`
--

CREATE TABLE `pma__usergroups` (
  `usergroup` varchar(64) COLLATE utf8_bin NOT NULL,
  `tab` varchar(64) COLLATE utf8_bin NOT NULL,
  `allowed` enum('Y','N') COLLATE utf8_bin NOT NULL DEFAULT 'N'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='User groups with configured menu items';

-- --------------------------------------------------------

--
-- Table structure for table `pma__users`
--

CREATE TABLE `pma__users` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `usergroup` varchar(64) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Users and their assignments to user groups';

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pma__bookmark`
--
ALTER TABLE `pma__bookmark`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pma__central_columns`
--
ALTER TABLE `pma__central_columns`
  ADD PRIMARY KEY (`db_name`,`col_name`);

--
-- Indexes for table `pma__column_info`
--
ALTER TABLE `pma__column_info`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `db_name` (`db_name`,`table_name`,`column_name`);

--
-- Indexes for table `pma__designer_settings`
--
ALTER TABLE `pma__designer_settings`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `pma__export_templates`
--
ALTER TABLE `pma__export_templates`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `u_user_type_template` (`username`,`export_type`,`template_name`);

--
-- Indexes for table `pma__favorite`
--
ALTER TABLE `pma__favorite`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `pma__history`
--
ALTER TABLE `pma__history`
  ADD PRIMARY KEY (`id`),
  ADD KEY `username` (`username`,`db`,`table`,`timevalue`);

--
-- Indexes for table `pma__navigationhiding`
--
ALTER TABLE `pma__navigationhiding`
  ADD PRIMARY KEY (`username`,`item_name`,`item_type`,`db_name`,`table_name`);

--
-- Indexes for table `pma__pdf_pages`
--
ALTER TABLE `pma__pdf_pages`
  ADD PRIMARY KEY (`page_nr`),
  ADD KEY `db_name` (`db_name`);

--
-- Indexes for table `pma__recent`
--
ALTER TABLE `pma__recent`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `pma__relation`
--
ALTER TABLE `pma__relation`
  ADD PRIMARY KEY (`master_db`,`master_table`,`master_field`),
  ADD KEY `foreign_field` (`foreign_db`,`foreign_table`);

--
-- Indexes for table `pma__savedsearches`
--
ALTER TABLE `pma__savedsearches`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `u_savedsearches_username_dbname` (`username`,`db_name`,`search_name`);

--
-- Indexes for table `pma__table_coords`
--
ALTER TABLE `pma__table_coords`
  ADD PRIMARY KEY (`db_name`,`table_name`,`pdf_page_number`);

--
-- Indexes for table `pma__table_info`
--
ALTER TABLE `pma__table_info`
  ADD PRIMARY KEY (`db_name`,`table_name`);

--
-- Indexes for table `pma__table_uiprefs`
--
ALTER TABLE `pma__table_uiprefs`
  ADD PRIMARY KEY (`username`,`db_name`,`table_name`);

--
-- Indexes for table `pma__tracking`
--
ALTER TABLE `pma__tracking`
  ADD PRIMARY KEY (`db_name`,`table_name`,`version`);

--
-- Indexes for table `pma__userconfig`
--
ALTER TABLE `pma__userconfig`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `pma__usergroups`
--
ALTER TABLE `pma__usergroups`
  ADD PRIMARY KEY (`usergroup`,`tab`,`allowed`);

--
-- Indexes for table `pma__users`
--
ALTER TABLE `pma__users`
  ADD PRIMARY KEY (`username`,`usergroup`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pma__bookmark`
--
ALTER TABLE `pma__bookmark`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pma__column_info`
--
ALTER TABLE `pma__column_info`
  MODIFY `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pma__export_templates`
--
ALTER TABLE `pma__export_templates`
  MODIFY `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pma__history`
--
ALTER TABLE `pma__history`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pma__pdf_pages`
--
ALTER TABLE `pma__pdf_pages`
  MODIFY `page_nr` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pma__savedsearches`
--
ALTER TABLE `pma__savedsearches`
  MODIFY `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- Database: `restoran_pujasera`
--
CREATE DATABASE IF NOT EXISTS `restoran_pujasera` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `restoran_pujasera`;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_admin`
--

CREATE TABLE `tbl_admin` (
  `ID` int(11) NOT NULL,
  `Nama` varchar(100) NOT NULL,
  `Username` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `ID_job` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_admin`
--

INSERT INTO `tbl_admin` (`ID`, `Nama`, `Username`, `Password`, `ID_job`) VALUES
(1, 'Super Admin', 'superadmin', 'superadmin', 1),
(3, 'Admin', 'admin', 'admin', 2),
(5, 'Pegawai', 'pegawai', 'pegawai', 3),
(6, 'Kasir Devya', 'kasir', 'kasir', 3),
(8, 'Kasir Lury', 'lury', 'lury', 3),
(9, 'vemas', 'vemas', 'vemas', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_fd`
--

CREATE TABLE `tbl_fd` (
  `ID_menu_makanan` int(11) NOT NULL,
  `Nama` varchar(100) NOT NULL,
  `Harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_fd`
--

INSERT INTO `tbl_fd` (`ID_menu_makanan`, `Nama`, `Harga`) VALUES
(1, 'Ayam bakar', 20000),
(2, 'Bakso', 7000),
(3, 'Gudeg', 15000),
(4, 'Pempek', 12000),
(5, 'Bebek bakar', 22000),
(6, 'Gado Gado', 10000),
(7, 'Nasi goreng', 10000),
(8, 'Soto ayam', 12000),
(9, 'Sate gule', 20000),
(10, 'Nasi jagung', 10000),
(11, 'Rawon', 15000),
(12, 'Nasi putih', 3000),
(13, 'Sate ayam', 13000),
(14, 'Ayam rica rica', 9000),
(15, 'Rendang', 10000),
(16, 'Sop Iga', 20000),
(17, 'Mie Ayam', 7000),
(18, 'Ketoprak', 10000),
(19, 'Pecel Lele', 8000),
(20, 'Cap Cai', 10000),
(21, 'Gurame Bakar', 35000),
(22, 'Nila Bakar', 25000),
(23, 'Siomay', 8000),
(24, 'Bubur Ayam', 10000),
(25, 'Pecel', 7000),
(26, 'Nasi Uduk', 10000),
(27, 'Gulai ikan patin', 22000),
(28, 'Serabi ', 7000),
(29, 'Ayam betutu', 15000),
(30, 'Kepiting soka', 40000),
(31, 'Ayam taliwang', 50000),
(32, 'Semur jengkol', 12000),
(33, 'Mie goreng', 5000),
(34, 'Soto banjar', 15000),
(35, 'Seblak', 10000),
(36, 'Dadar gulung', 3000),
(37, 'Cireng', 8000),
(38, 'Ketupat', 8000),
(39, 'Batagor', 7000),
(40, 'Roti bakar', 10000),
(41, 'Risol', 5000),
(42, 'Nasi padang', 17000),
(43, 'Rujak buah', 7000),
(44, 'Nasi penyet', 12000),
(45, 'Martabak manis', 20000),
(46, 'Tahu campur', 10000),
(47, 'Lontong balap', 12000),
(48, 'Papeda ', 20000),
(49, 'Nasi tempong', 6000),
(50, 'Gethuk pisang', 8000),
(51, 'Ayam lodho', 45000),
(52, 'Petulo', 6000),
(53, 'Krengsengan', 15000),
(54, 'Kwetiau goreng', 10000),
(55, 'Kelepon', 5000),
(56, 'Mie aceh', 15000),
(57, 'Kapurung', 12000),
(58, 'Tengkleng', 25000),
(59, 'Ayam geprek', 10000),
(60, 'Nasi pindang', 15000),
(61, 'Pepes ikan', 7000),
(62, 'Nasi lodeh', 10000),
(63, 'Otak otak', 10000),
(64, 'Nasi lemak', 10000),
(65, 'Nasi campur', 10000),
(66, 'Nasi kikil', 15000),
(67, 'Es teh', 5000),
(68, 'Teh hangat', 4000),
(69, 'Es jeruk', 5000),
(70, 'Jeruk Hangat', 4000),
(71, 'Es campur', 10000),
(72, 'Es buah', 10000),
(73, 'Es degan', 8000),
(74, 'Es oyen', 8000),
(75, 'Es dawet', 6000),
(76, 'Kopi susu', 4000),
(77, 'Es genderuwo', 9000),
(78, 'Es milo', 6000),
(79, 'Es capcin', 6000),
(80, 'Es pisang hijau ', 10000),
(81, 'Es doger', 10000),
(82, 'Es cendol', 7000),
(83, 'Es teler', 6000),
(84, 'Es timun serut', 6000),
(85, 'Es bubur kacang ijo', 7000),
(86, 'Jus buah', 8000),
(87, 'Es blewah', 4000),
(88, 'Es kuku bima susu', 5000),
(89, 'Air mineral', 5000),
(90, 'Wedang ronde', 10000),
(91, 'Es slendang mayang', 10000),
(92, 'Sekoteng', 10000),
(93, 'Es kuwut', 10000),
(94, 'Es soda gembira', 10000),
(95, 'Milk tea', 6000),
(96, 'Wedang jahe', 5000),
(97, 'STMJ', 7000),
(98, 'Wedang uwuh', 7000),
(99, 'Es sinom', 5000),
(100, 'Es green tea', 7000),
(101, 'Bakmie', 10000);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_job`
--

CREATE TABLE `tbl_job` (
  `ID` int(11) NOT NULL,
  `Nama` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_job`
--

INSERT INTO `tbl_job` (`ID`, `Nama`) VALUES
(1, 'Super Admin'),
(2, 'Admin'),
(3, 'Pegawai');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_transaksi`
--

CREATE TABLE `tbl_transaksi` (
  `ID` int(11) NOT NULL,
  `nomerFaktur` varchar(15) NOT NULL,
  `ID_fd` int(11) NOT NULL,
  `qty` int(11) NOT NULL,
  `Total_harga` int(11) NOT NULL,
  `Datetime` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `namaCustomer` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_transaksi`
--

INSERT INTO `tbl_transaksi` (`ID`, `nomerFaktur`, `ID_fd`, `qty`, `Total_harga`, `Datetime`, `namaCustomer`) VALUES
(1, 'TSC31122022001', 1, 2, 40000, '2022-12-30 05:28:06', 'Deli'),
(2, 'TSC31122022001', 2, 2, 14000, '2022-12-30 05:31:56', 'Deli'),
(5, 'TSC31122022002', 2, 3, 21000, '2022-12-31 00:35:12', ''),
(6, 'TSC31122022002', 3, 1, 15000, '2022-12-31 00:35:12', ''),
(7, 'TSC31122022003', 3, 3, 45000, '2022-12-31 00:36:40', 'Deli'),
(8, 'TSC31122022004', 2, 1, 7000, '2022-12-31 00:38:06', ''),
(9, 'TSC31122022004', 4, 2, 24000, '2022-12-31 00:38:06', ''),
(10, 'TSC31122022005', 4, 2, 24000, '2022-12-31 00:41:42', ''),
(11, 'TSC31122022005', 36, 1, 3000, '2022-12-31 00:41:45', ''),
(12, 'TSC31122022005', 47, 1, 3000, '2022-12-31 00:41:47', ''),
(13, 'TSC31122022006', 47, 1, 12000, '2022-12-31 00:43:57', 'Deli'),
(14, 'TSC31122022006', 63, 1, 10000, '2022-12-31 00:43:57', 'Deli'),
(15, 'TSC31122022006', 75, 2, 12000, '2022-12-31 00:43:57', 'Deli'),
(16, 'TSC31122022007', 1, 1, 20000, '2022-12-31 00:47:53', ''),
(17, 'TSC31122022007', 2, 1, 7000, '2022-12-31 00:47:53', ''),
(18, 'TSC31122022008', 2, 1, 7000, '2022-12-31 04:52:13', 'Ilham'),
(19, 'TSC31122022008', 3, 3, 45000, '2022-12-31 04:52:13', 'Ilham'),
(20, 'TSC31122022009', 2, 1, 7000, '2022-12-31 06:03:24', 'Deli'),
(21, 'TSC31122022009', 3, 1, 15000, '2022-12-31 06:03:24', 'Deli'),
(22, 'TSC31122022009', 1, 1, 20000, '2022-12-31 06:03:24', 'Deli');

-- --------------------------------------------------------

--
-- Stand-in structure for view `vadmin`
-- (See below for the actual view)
--
CREATE TABLE `vadmin` (
`ID` int(11)
,`Nama` varchar(100)
,`Username` varchar(100)
,`Pekerjaan` varchar(100)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `vtransaksi`
-- (See below for the actual view)
--
CREATE TABLE `vtransaksi` (
`ID` int(11)
,`nomerFaktur` varchar(15)
,`namaMakanan` varchar(100)
,`HargaSatuan` int(11)
,`qty` int(11)
,`Total_harga` int(11)
,`Datetime` timestamp
,`namaCustomer` varchar(50)
);

-- --------------------------------------------------------

--
-- Structure for view `vadmin`
--
DROP TABLE IF EXISTS `vadmin`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vadmin`  AS SELECT `tbl_admin`.`ID` AS `ID`, `tbl_admin`.`Nama` AS `Nama`, `tbl_admin`.`Username` AS `Username`, `tbl_job`.`Nama` AS `Pekerjaan` FROM (`tbl_job` join `tbl_admin` on(`tbl_admin`.`ID_job` = `tbl_job`.`ID`))  ;

-- --------------------------------------------------------

--
-- Structure for view `vtransaksi`
--
DROP TABLE IF EXISTS `vtransaksi`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vtransaksi`  AS SELECT `tbl_transaksi`.`ID` AS `ID`, `tbl_transaksi`.`nomerFaktur` AS `nomerFaktur`, `tbl_fd`.`Nama` AS `namaMakanan`, `tbl_fd`.`Harga` AS `HargaSatuan`, `tbl_transaksi`.`qty` AS `qty`, `tbl_transaksi`.`Total_harga` AS `Total_harga`, `tbl_transaksi`.`Datetime` AS `Datetime`, `tbl_transaksi`.`namaCustomer` AS `namaCustomer` FROM (`tbl_transaksi` join `tbl_fd` on(`tbl_transaksi`.`ID_fd` = `tbl_fd`.`ID_menu_makanan`))  ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_admin`
--
ALTER TABLE `tbl_admin`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `tbl_fd`
--
ALTER TABLE `tbl_fd`
  ADD PRIMARY KEY (`ID_menu_makanan`);

--
-- Indexes for table `tbl_job`
--
ALTER TABLE `tbl_job`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `tbl_transaksi`
--
ALTER TABLE `tbl_transaksi`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_admin`
--
ALTER TABLE `tbl_admin`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `tbl_fd`
--
ALTER TABLE `tbl_fd`
  MODIFY `ID_menu_makanan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=102;

--
-- AUTO_INCREMENT for table `tbl_job`
--
ALTER TABLE `tbl_job`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tbl_transaksi`
--
ALTER TABLE `tbl_transaksi`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;
--
-- Database: `test`
--
CREATE DATABASE IF NOT EXISTS `test` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `test`;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
