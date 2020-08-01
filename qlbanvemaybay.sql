/*
 Navicat Premium Data Transfer

 Source Server         : qlbanvemaybay
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : qlbanvemaybay

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 01/08/2020 22:43:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `idNhanVien` int(255) UNSIGNED NOT NULL,
  PRIMARY KEY (`idNhanVien`) USING BTREE,
  CONSTRAINT `admin_ibfk_1` FOREIGN KEY (`idNhanVien`) REFERENCES `nhanvien` (`idNhanVien`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for chuyenbay
-- ----------------------------
DROP TABLE IF EXISTS `chuyenbay`;
CREATE TABLE `chuyenbay`  (
  `MaCB` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `MaSBDi` int(255) UNSIGNED NOT NULL,
  `MaSBDen` int(255) UNSIGNED NOT NULL,
  `NgayKhoiHanh` datetime(6) NULL DEFAULT NULL,
  `ThoiGianBay` float(255, 0) NULL DEFAULT NULL,
  `TinhTrang` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`MaCB`) USING BTREE,
  INDEX `MaSBDi`(`MaSBDi`) USING BTREE,
  INDEX `MaSBDen`(`MaSBDen`) USING BTREE,
  CONSTRAINT `chuyenbay_ibfk_1` FOREIGN KEY (`MaSBDi`) REFERENCES `sanbay` (`MaSB`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `chuyenbay_ibfk_2` FOREIGN KEY (`MaSBDen`) REFERENCES `sanbay` (`MaSB`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for giahangvetheocb
-- ----------------------------
DROP TABLE IF EXISTS `giahangvetheocb`;
CREATE TABLE `giahangvetheocb`  (
  `MaCB` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `MaHangVe` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `GiaHienTai` decimal(65, 0) NOT NULL,
  PRIMARY KEY (`MaCB`, `MaHangVe`) USING BTREE,
  INDEX `MaHangVe`(`MaHangVe`) USING BTREE,
  CONSTRAINT `giahangvetheocb_ibfk_1` FOREIGN KEY (`MaHangVe`) REFERENCES `hangve` (`MaHangVe`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `giahangvetheocb_ibfk_2` FOREIGN KEY (`MaCB`) REFERENCES `chuyenbay` (`MaCB`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for hangve
-- ----------------------------
DROP TABLE IF EXISTS `hangve`;
CREATE TABLE `hangve`  (
  `MaHangVe` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `TenHangVe` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`MaHangVe`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for hoadonmuave
-- ----------------------------
DROP TABLE IF EXISTS `hoadonmuave`;
CREATE TABLE `hoadonmuave`  (
  `idHoaDon` int(255) UNSIGNED NOT NULL AUTO_INCREMENT,
  `NgayMua` datetime(6) NOT NULL,
  `GiaVe` decimal(65, 0) NOT NULL,
  `maKH` int(255) UNSIGNED NOT NULL,
  `MaSoVe` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`idHoaDon`) USING BTREE,
  INDEX `maKH`(`maKH`) USING BTREE,
  INDEX `hoadonmuave_ibfk_2`(`MaSoVe`) USING BTREE,
  CONSTRAINT `hoadonmuave_ibfk_1` FOREIGN KEY (`maKH`) REFERENCES `khachhang` (`maKH`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `hoadonmuave_ibfk_2` FOREIGN KEY (`MaSoVe`) REFERENCES `vechuyenbay` (`MaSoVe`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for khachhang
-- ----------------------------
DROP TABLE IF EXISTS `khachhang`;
CREATE TABLE `khachhang`  (
  `maKH` int(255) UNSIGNED NOT NULL AUTO_INCREMENT,
  `HoTen` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `SDT` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `GioiTinh` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `NgaySinh` date NULL DEFAULT NULL,
  PRIMARY KEY (`maKH`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for khachnuocngoai
-- ----------------------------
DROP TABLE IF EXISTS `khachnuocngoai`;
CREATE TABLE `khachnuocngoai`  (
  `maKH` int(255) UNSIGNED NOT NULL,
  `QuocTich` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `HoChieu` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`maKH`) USING BTREE,
  CONSTRAINT `khachnuocngoai_ibfk_1` FOREIGN KEY (`maKH`) REFERENCES `khachhang` (`maKH`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for khachvietnam
-- ----------------------------
DROP TABLE IF EXISTS `khachvietnam`;
CREATE TABLE `khachvietnam`  (
  `maKH` int(255) UNSIGNED NOT NULL,
  `CMND` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `NgheNghiep` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `DiaChi` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`maKH`) USING BTREE,
  CONSTRAINT `khachvietnam_ibfk_1` FOREIGN KEY (`maKH`) REFERENCES `khachhang` (`maKH`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for lichsugiahangvecb
-- ----------------------------
DROP TABLE IF EXISTS `lichsugiahangvecb`;
CREATE TABLE `lichsugiahangvecb`  (
  `idCapNhat` int(255) UNSIGNED NOT NULL AUTO_INCREMENT,
  `MaCB` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `MaHangVe` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `NgayCapNhat` datetime(6) NOT NULL,
  `GiaCapNhat` decimal(65, 0) NOT NULL,
  PRIMARY KEY (`idCapNhat`) USING BTREE,
  INDEX `MaCB`(`MaCB`, `MaHangVe`) USING BTREE,
  CONSTRAINT `lichsugiahangvecb_ibfk_1` FOREIGN KEY (`MaCB`, `MaHangVe`) REFERENCES `giahangvetheocb` (`MaCB`, `MaHangVe`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for nhanvien
-- ----------------------------
DROP TABLE IF EXISTS `nhanvien`;
CREATE TABLE `nhanvien`  (
  `idNhanVien` int(255) UNSIGNED NOT NULL AUTO_INCREMENT,
  `HoTen` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `GioiTinh` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `NgaySinh` date NULL DEFAULT NULL,
  `SDT` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `CMND` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`idNhanVien`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for nvbanve
-- ----------------------------
DROP TABLE IF EXISTS `nvbanve`;
CREATE TABLE `nvbanve`  (
  `idNhanVien` int(255) UNSIGNED NOT NULL,
  PRIMARY KEY (`idNhanVien`) USING BTREE,
  CONSTRAINT `nvbanve_ibfk_1` FOREIGN KEY (`idNhanVien`) REFERENCES `nhanvien` (`idNhanVien`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for phieu
-- ----------------------------
DROP TABLE IF EXISTS `phieu`;
CREATE TABLE `phieu`  (
  `idPhieu` int(255) UNSIGNED NOT NULL AUTO_INCREMENT,
  `NgayDat` datetime(6) NOT NULL,
  `TinhTrang` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `maKH` int(255) UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY (`idPhieu`) USING BTREE,
  INDEX `maKH`(`maKH`) USING BTREE,
  CONSTRAINT `phieu_ibfk_1` FOREIGN KEY (`maKH`) REFERENCES `khachhang` (`maKH`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for phieucho
-- ----------------------------
DROP TABLE IF EXISTS `phieucho`;
CREATE TABLE `phieucho`  (
  `idPhieu` int(255) UNSIGNED NOT NULL,
  `maCB` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`idPhieu`) USING BTREE,
  INDEX `maCB`(`maCB`) USING BTREE,
  CONSTRAINT `phieucho_ibfk_1` FOREIGN KEY (`idPhieu`) REFERENCES `phieu` (`idPhieu`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `phieucho_ibfk_2` FOREIGN KEY (`maCB`) REFERENCES `chuyenbay` (`MaCB`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for phieudatcho
-- ----------------------------
DROP TABLE IF EXISTS `phieudatcho`;
CREATE TABLE `phieudatcho`  (
  `idPhieu` int(255) UNSIGNED NOT NULL,
  `MaSoVe` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`idPhieu`) USING BTREE,
  INDEX `MaSoVe`(`MaSoVe`) USING BTREE,
  CONSTRAINT `phieudatcho_ibfk_1` FOREIGN KEY (`idPhieu`) REFERENCES `phieu` (`idPhieu`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `phieudatcho_ibfk_2` FOREIGN KEY (`MaSoVe`) REFERENCES `vechuyenbay` (`MaSoVe`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for quydinh
-- ----------------------------
DROP TABLE IF EXISTS `quydinh`;
CREATE TABLE `quydinh`  (
  `idQuyDinh` int(255) UNSIGNED NOT NULL AUTO_INCREMENT,
  `TenQuyDinh` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `Kieu` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `GiaTri` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `TinhTrang` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`idQuyDinh`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sanbay
-- ----------------------------
DROP TABLE IF EXISTS `sanbay`;
CREATE TABLE `sanbay`  (
  `MaSB` int(255) UNSIGNED NOT NULL AUTO_INCREMENT,
  `TenSB` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `ThanhPho` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`MaSB`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sanbaytrunggian
-- ----------------------------
DROP TABLE IF EXISTS `sanbaytrunggian`;
CREATE TABLE `sanbaytrunggian`  (
  `MaCB` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `MaSB` int(255) UNSIGNED NOT NULL,
  `ThoiGianDung` float(255, 0) NOT NULL,
  `GhiChu` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`MaCB`, `MaSB`) USING BTREE,
  INDEX `MaSB`(`MaSB`) USING BTREE,
  CONSTRAINT `sanbaytrunggian_ibfk_1` FOREIGN KEY (`MaCB`) REFERENCES `chuyenbay` (`MaCB`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `sanbaytrunggian_ibfk_2` FOREIGN KEY (`MaSB`) REFERENCES `sanbay` (`MaSB`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for taikhoan
-- ----------------------------
DROP TABLE IF EXISTS `taikhoan`;
CREATE TABLE `taikhoan`  (
  `idNhanVien` int(255) UNSIGNED NOT NULL,
  `TenTaiKhoan` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `MatKhau` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`idNhanVien`) USING BTREE,
  CONSTRAINT `taikhoan_ibfk_1` FOREIGN KEY (`idNhanVien`) REFERENCES `nhanvien` (`idNhanVien`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for vechuyenbay
-- ----------------------------
DROP TABLE IF EXISTS `vechuyenbay`;
CREATE TABLE `vechuyenbay`  (
  `MaSoVe` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `TinhTrang` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `MaCB` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `MaHangVe` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`MaSoVe`) USING BTREE,
  INDEX `MaHangVe`(`MaHangVe`) USING BTREE,
  INDEX `MaCB`(`MaCB`) USING BTREE,
  CONSTRAINT `vechuyenbay_ibfk_1` FOREIGN KEY (`MaHangVe`) REFERENCES `hangve` (`MaHangVe`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `vechuyenbay_ibfk_2` FOREIGN KEY (`MaCB`) REFERENCES `chuyenbay` (`MaCB`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;