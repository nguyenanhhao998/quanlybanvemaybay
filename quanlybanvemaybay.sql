/*
 Navicat Premium Data Transfer

 Source Server         : qlbanvemaybay
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : quanlybanvemaybay

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 26/08/2020 21:09:26
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
  `MaSBDi` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `MaSBDen` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `NgayKhoiHanh` datetime(6) NULL DEFAULT NULL,
  `ThoiGianBay` float(255, 1) NULL DEFAULT NULL,
  `TinhTrang` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`MaCB`) USING BTREE,
  INDEX `MaSBDi`(`MaSBDi`) USING BTREE,
  INDEX `MaSBDen`(`MaSBDen`) USING BTREE,
  CONSTRAINT `chuyenbay_ibfk_1` FOREIGN KEY (`MaSBDi`) REFERENCES `sanbay` (`MaSB`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `chuyenbay_ibfk_2` FOREIGN KEY (`MaSBDen`) REFERENCES `sanbay` (`MaSB`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of chuyenbay
-- ----------------------------
INSERT INTO `chuyenbay` VALUES ('CB001', 'SGN', 'HAN', '2020-08-28 03:00:00.000000', 1.5, 'Chưa khởi hành');
INSERT INTO `chuyenbay` VALUES ('CB002', 'SGN', 'HAN', '2020-08-28 10:00:00.000000', 2.0, 'Chưa khởi hành');
INSERT INTO `chuyenbay` VALUES ('CB003', 'SGN', 'HAN', '2020-08-28 12:30:00.000000', 2.0, 'Chưa khởi hành');
INSERT INTO `chuyenbay` VALUES ('CB004', 'HAN', 'SGN', '2020-08-30 16:00:00.000000', 2.0, 'Chưa khởi hành');
INSERT INTO `chuyenbay` VALUES ('CB005', 'HAN', 'SGN', '2020-08-30 03:30:00.000000', 1.5, 'Chưa khởi hành');
INSERT INTO `chuyenbay` VALUES ('CB006', 'SGN', 'ICN', '2020-08-28 09:00:00.000000', 6.0, 'Chưa khởi hành');
INSERT INTO `chuyenbay` VALUES ('CB007', 'HAN', 'ICN', '2020-08-29 09:00:00.000000', 10.0, 'Chưa khởi hành');
INSERT INTO `chuyenbay` VALUES ('CB008', 'SGN', 'MEL', '2020-08-29 13:30:00.000000', 12.0, 'Chưa khởi hành');
INSERT INTO `chuyenbay` VALUES ('CB009', 'SGN', 'HKG', '2020-08-28 18:00:00.000000', 2.5, 'Chưa khởi hành');
INSERT INTO `chuyenbay` VALUES ('CB010', 'SGN', 'DAD', '2020-08-28 07:30:00.000000', 1.5, 'Chưa khởi hành');

-- ----------------------------
-- Table structure for giahangvetheocb
-- ----------------------------
DROP TABLE IF EXISTS `giahangvetheocb`;
CREATE TABLE `giahangvetheocb`  (
  `MaCB` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `MaHangVe` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `GiaHienTai` double(255, 0) NOT NULL,
  PRIMARY KEY (`MaCB`, `MaHangVe`) USING BTREE,
  INDEX `MaHangVe`(`MaHangVe`) USING BTREE,
  CONSTRAINT `giahangvetheocb_ibfk_1` FOREIGN KEY (`MaHangVe`) REFERENCES `hangve` (`MaHangVe`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `giahangvetheocb_ibfk_2` FOREIGN KEY (`MaCB`) REFERENCES `chuyenbay` (`MaCB`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of giahangvetheocb
-- ----------------------------
INSERT INTO `giahangvetheocb` VALUES ('CB001', 'hv_pt', 450000);
INSERT INTO `giahangvetheocb` VALUES ('CB001', 'hv_ptdb', 550000);
INSERT INTO `giahangvetheocb` VALUES ('CB002', 'hv_pt', 480000);
INSERT INTO `giahangvetheocb` VALUES ('CB002', 'hv_tg', 620000);
INSERT INTO `giahangvetheocb` VALUES ('CB003', 'hv_pt', 440000);
INSERT INTO `giahangvetheocb` VALUES ('CB004', 'hv_pt', 470000);
INSERT INTO `giahangvetheocb` VALUES ('CB004', 'hv_ptdb', 530000);
INSERT INTO `giahangvetheocb` VALUES ('CB005', 'hv_pt', 500000);
INSERT INTO `giahangvetheocb` VALUES ('CB006', 'hv_pt', 5000000);
INSERT INTO `giahangvetheocb` VALUES ('CB006', 'hv_ptdb', 5500000);
INSERT INTO `giahangvetheocb` VALUES ('CB007', 'hv_ptdb', 5000000);
INSERT INTO `giahangvetheocb` VALUES ('CB007', 'hv_tg', 8400000);
INSERT INTO `giahangvetheocb` VALUES ('CB008', 'hv_pt', 7000000);
INSERT INTO `giahangvetheocb` VALUES ('CB008', 'hv_tg', 12500000);
INSERT INTO `giahangvetheocb` VALUES ('CB009', 'hv_pt', 600000);
INSERT INTO `giahangvetheocb` VALUES ('CB010', 'hv_pt', 400000);
INSERT INTO `giahangvetheocb` VALUES ('CB010', 'hv_ptdb', 450000);

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
-- Records of hangve
-- ----------------------------
INSERT INTO `hangve` VALUES ('hv_pt', 'Phổ thông');
INSERT INTO `hangve` VALUES ('hv_ptdb', 'Phổ thông đặc biệt');
INSERT INTO `hangve` VALUES ('hv_tg', 'Thương gia');

-- ----------------------------
-- Table structure for hoadonmuave
-- ----------------------------
DROP TABLE IF EXISTS `hoadonmuave`;
CREATE TABLE `hoadonmuave`  (
  `idHoaDon` int(255) UNSIGNED NOT NULL AUTO_INCREMENT,
  `NgayMua` datetime(6) NOT NULL,
  `GiaVe` double(255, 0) NOT NULL,
  `maKH` int(255) UNSIGNED NOT NULL,
  `MaSoVe` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`idHoaDon`) USING BTREE,
  INDEX `maKH`(`maKH`) USING BTREE,
  INDEX `hoadonmuave_ibfk_2`(`MaSoVe`) USING BTREE,
  CONSTRAINT `hoadonmuave_ibfk_1` FOREIGN KEY (`maKH`) REFERENCES `khachhang` (`maKH`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `hoadonmuave_ibfk_2` FOREIGN KEY (`MaSoVe`) REFERENCES `vechuyenbay` (`MaSoVe`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hoadonmuave
-- ----------------------------
INSERT INTO `hoadonmuave` VALUES (1, '2020-08-26 20:47:23.368000', 450000, 1, 'VE002');
INSERT INTO `hoadonmuave` VALUES (2, '2020-08-26 20:47:23.462000', 450000, 2, 'VE001');
INSERT INTO `hoadonmuave` VALUES (3, '2020-08-26 20:52:16.031000', 500000, 3, 'VE010');
INSERT INTO `hoadonmuave` VALUES (4, '2020-08-26 20:52:16.041000', 500000, 4, 'VE009');
INSERT INTO `hoadonmuave` VALUES (5, '2020-08-26 20:54:11.182000', 600000, 5, 'VE017');

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
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of khachhang
-- ----------------------------
INSERT INTO `khachhang` VALUES (1, 'Trần Văn Chinh', '0987654321', 'Nam', '1995-08-16');
INSERT INTO `khachhang` VALUES (2, 'Nguyễn Tú Hoa', '0987654312', 'Nữ', '1996-08-21');
INSERT INTO `khachhang` VALUES (3, 'John Wick', '0312456789', 'Nam', '1990-08-23');
INSERT INTO `khachhang` VALUES (4, 'John Witch', '0312456780', 'Nữ', '1990-08-30');
INSERT INTO `khachhang` VALUES (5, 'Trần Văn Cường', '0987675643', 'Nam', '1993-08-26');
INSERT INTO `khachhang` VALUES (6, 'Nguyễn Văn Huy', '0938759864', 'Nam', '1998-08-20');
INSERT INTO `khachhang` VALUES (7, 'Nguyễn Hải', '0968758458', 'Nam', '1999-08-26');
INSERT INTO `khachhang` VALUES (8, 'Trịnh Hoài Nam', '0968758441', 'Nam', '1997-08-14');
INSERT INTO `khachhang` VALUES (9, 'Trịnh Khánh Duy', '0965874589', 'Nam', '1999-08-20');
INSERT INTO `khachhang` VALUES (10, 'Hoàng Văn Hào', '0968758456', 'Nam', '1992-08-21');

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
-- Records of khachnuocngoai
-- ----------------------------
INSERT INTO `khachnuocngoai` VALUES (3, 'Mỹ', '09876543210');
INSERT INTO `khachnuocngoai` VALUES (4, 'Mỹ', '09876512340');

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
-- Records of khachvietnam
-- ----------------------------
INSERT INTO `khachvietnam` VALUES (1, '012345666', 'Kinh doanh', '1 Nguyễn Trãi, P1, Q1, TPHCM');
INSERT INTO `khachvietnam` VALUES (2, '012345555', 'Nhân viên văn phòng', '90 Nguyễn Trãi, P2, Q1, TPHCM');
INSERT INTO `khachvietnam` VALUES (5, '025876554', 'Tài xế', '3 Nguyễn Oanh, Q.Gò Vấp, TPHCM');
INSERT INTO `khachvietnam` VALUES (6, '025648777', 'Sinh viên', '2/40 Nguyễn Trãi, P5, Q5, TPHCM');
INSERT INTO `khachvietnam` VALUES (7, '025874999', 'Sinh viên', '23/32 Võ Thị Sáu, P3, Q3, TPHCM');
INSERT INTO `khachvietnam` VALUES (8, '025488555', 'Lập trình viên', '2 Quang Trung, P11, Quận Gò Vấp ');
INSERT INTO `khachvietnam` VALUES (9, '025489655', 'Sinh viên', '2 Nguyễn Oanh, P6, Q. Gò Vấp, TPHCM');
INSERT INTO `khachvietnam` VALUES (10, '025489654', 'Lập trình viên', '1 Nguyễn Văn Trỗi, P4, Q1, TPHCM');

-- ----------------------------
-- Table structure for lichsugiahangvecb
-- ----------------------------
DROP TABLE IF EXISTS `lichsugiahangvecb`;
CREATE TABLE `lichsugiahangvecb`  (
  `idCapNhat` int(255) UNSIGNED NOT NULL AUTO_INCREMENT,
  `MaCB` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `MaHangVe` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `NgayCapNhat` datetime(6) NOT NULL,
  `GiaCapNhat` double(255, 0) NOT NULL,
  PRIMARY KEY (`idCapNhat`) USING BTREE,
  INDEX `MaCB`(`MaCB`, `MaHangVe`) USING BTREE,
  CONSTRAINT `lichsugiahangvecb_ibfk_1` FOREIGN KEY (`MaCB`, `MaHangVe`) REFERENCES `giahangvetheocb` (`MaCB`, `MaHangVe`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

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
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

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
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of phieu
-- ----------------------------
INSERT INTO `phieu` VALUES (1, '2020-08-26 20:57:38.179000', 'Còn hiệu lực', 6);
INSERT INTO `phieu` VALUES (2, '2020-08-26 20:59:56.685000', 'Còn hiệu lực', 7);
INSERT INTO `phieu` VALUES (3, '2020-08-26 21:02:45.839000', 'Còn hiệu lực', 8);
INSERT INTO `phieu` VALUES (4, '2020-08-26 21:05:02.719000', 'Còn hiệu lực', 9);
INSERT INTO `phieu` VALUES (5, '2020-08-26 21:07:00.360000', 'Còn hiệu lực', 10);

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
-- Records of phieucho
-- ----------------------------
INSERT INTO `phieucho` VALUES (3, 'CB004');
INSERT INTO `phieucho` VALUES (4, 'CB008');
INSERT INTO `phieucho` VALUES (5, 'CB010');

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
-- Records of phieudatcho
-- ----------------------------
INSERT INTO `phieudatcho` VALUES (1, 'VE003');
INSERT INTO `phieudatcho` VALUES (2, 'VE006');

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
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sanbay
-- ----------------------------
DROP TABLE IF EXISTS `sanbay`;
CREATE TABLE `sanbay`  (
  `MaSB` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `TenSB` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `ThanhPho` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `QuocGia` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`MaSB`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sanbay
-- ----------------------------
INSERT INTO `sanbay` VALUES ('DAD', 'Sân bay Đà nẵng', 'Đà Nẵng', 'Việt Nam');
INSERT INTO `sanbay` VALUES ('HAN', 'Sân bay Nội Bài', 'Hà Nội', 'Việt Nam');
INSERT INTO `sanbay` VALUES ('HKG', 'Sân bay quốc tế Hong Kong', 'Hong Kong', 'Hồng Kông');
INSERT INTO `sanbay` VALUES ('ICN', 'Sân bay quốc tế Incheon', 'Seoul', 'Hàn Quốc');
INSERT INTO `sanbay` VALUES ('MEL', 'Sân bay quốc tế Melbourne', 'Melbourne', 'Úc');
INSERT INTO `sanbay` VALUES ('SGN', 'Sân bay Tân Sơn nhất', 'TPHCM', 'Việt Nam');

-- ----------------------------
-- Table structure for sanbaytrunggian
-- ----------------------------
DROP TABLE IF EXISTS `sanbaytrunggian`;
CREATE TABLE `sanbaytrunggian`  (
  `MaCB` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `MaSB` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `ThoiGianDung` float(255, 1) NOT NULL,
  `GhiChu` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`MaCB`, `MaSB`) USING BTREE,
  INDEX `MaSB`(`MaSB`) USING BTREE,
  CONSTRAINT `sanbaytrunggian_ibfk_1` FOREIGN KEY (`MaCB`) REFERENCES `chuyenbay` (`MaCB`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `sanbaytrunggian_ibfk_2` FOREIGN KEY (`MaSB`) REFERENCES `sanbay` (`MaSB`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sanbaytrunggian
-- ----------------------------
INSERT INTO `sanbaytrunggian` VALUES ('CB006', 'HAN', 0.5, 'Tiếp nhiên liệu');
INSERT INTO `sanbaytrunggian` VALUES ('CB007', 'HKG', 1.0, 'Tiếp nhiên liệu');
INSERT INTO `sanbaytrunggian` VALUES ('CB008', 'DAD', 0.5, 'Tiếp nhiên liệu');
INSERT INTO `sanbaytrunggian` VALUES ('CB008', 'HKG', 0.5, 'Tiếp nhiên liệu');

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

-- ----------------------------
-- Records of vechuyenbay
-- ----------------------------
INSERT INTO `vechuyenbay` VALUES ('VE001', 'Đã được mua', 'CB001', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('VE002', 'Đã được mua', 'CB001', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('VE003', 'Đã được đặt', 'CB001', 'hv_ptdb');
INSERT INTO `vechuyenbay` VALUES ('VE004', 'Chưa được mua', 'CB002', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('VE005', 'Chưa được mua', 'CB002', 'hv_tg');
INSERT INTO `vechuyenbay` VALUES ('VE006', 'Đã được đặt', 'CB003', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('VE007', 'Chưa được mua', 'CB004', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('VE008', 'Chưa được mua', 'CB004', 'hv_ptdb');
INSERT INTO `vechuyenbay` VALUES ('VE009', 'Đã được mua', 'CB005', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('VE010', 'Đã được mua', 'CB005', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('VE011', 'Chưa được mua', 'CB006', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('VE012', 'Chưa được mua', 'CB006', 'hv_ptdb');
INSERT INTO `vechuyenbay` VALUES ('VE013', 'Chưa được mua', 'CB007', 'hv_ptdb');
INSERT INTO `vechuyenbay` VALUES ('VE014', 'Chưa được mua', 'CB007', 'hv_tg');
INSERT INTO `vechuyenbay` VALUES ('VE015', 'Chưa được mua', 'CB008', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('VE016', 'Chưa được mua', 'CB008', 'hv_tg');
INSERT INTO `vechuyenbay` VALUES ('VE017', 'Đã được mua', 'CB009', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('VE018', 'Chưa được mua', 'CB009', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('VE019', 'Chưa được mua', 'CB010', 'hv_ptdb');
INSERT INTO `vechuyenbay` VALUES ('VE020', 'Chưa được mua', 'CB010', 'hv_pt');

SET FOREIGN_KEY_CHECKS = 1;
