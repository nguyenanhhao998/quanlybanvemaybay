/*
 Navicat Premium Data Transfer

 Source Server         : mysql80navi
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : localhost:3306
 Source Schema         : quanlybanvemaybay

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 30/08/2020 23:07:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `idNhanVien` int(0) UNSIGNED NOT NULL,
  PRIMARY KEY (`idNhanVien`) USING BTREE,
  CONSTRAINT `admin_ibfk_1` FOREIGN KEY (`idNhanVien`) REFERENCES `nhanvien` (`idNhanVien`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (11);
INSERT INTO `admin` VALUES (12);

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
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of chuyenbay
-- ----------------------------
INSERT INTO `chuyenbay` VALUES ('CB001', 'DAD', 'ICN', '2020-07-30 05:00:00.000000', 3.5, 'Chưa khởi hành');
INSERT INTO `chuyenbay` VALUES ('CB002', 'SGN', 'HAN', '2020-08-28 10:00:00.000000', 2.0, 'Chưa khởi hành');
INSERT INTO `chuyenbay` VALUES ('CB003', 'SGN', 'HAN', '2020-08-28 12:30:00.000000', 2.0, 'Chưa khởi hành');
INSERT INTO `chuyenbay` VALUES ('CB004', 'HAN', 'SGN', '2020-08-30 16:00:00.000000', 2.0, 'Chưa khởi hành');
INSERT INTO `chuyenbay` VALUES ('CB005', 'HAN', 'SGN', '2020-08-30 03:30:00.000000', 1.5, 'Chưa khởi hành');
INSERT INTO `chuyenbay` VALUES ('CB006', 'ICN', 'ICN', '2020-08-28 10:00:00.000000', 6.0, 'Chưa khởi hành');
INSERT INTO `chuyenbay` VALUES ('CB007', 'HAN', 'ICN', '2020-08-29 09:00:00.000000', 10.0, 'Chưa khởi hành');
INSERT INTO `chuyenbay` VALUES ('CB008', 'SGN', 'MEL', '2020-08-29 13:30:00.000000', 12.0, 'Chưa khởi hành');
INSERT INTO `chuyenbay` VALUES ('CB009', 'SGN', 'HKG', '2020-08-28 18:00:00.000000', 2.5, 'Chưa khởi hành');
INSERT INTO `chuyenbay` VALUES ('CB010', 'SGN', 'DAD', '2020-08-28 07:30:00.000000', 1.5, 'Chưa khởi hành');
INSERT INTO `chuyenbay` VALUES ('CB029', 'DAD', 'DAD', '2020-08-22 00:00:07.504000', 0.0, 'Đã hủy');
INSERT INTO `chuyenbay` VALUES ('CB044', 'HAN', 'SGN', '2020-08-21 00:00:53.677000', 2.0, 'Đã hủy');
INSERT INTO `chuyenbay` VALUES ('CB045', 'DAD', 'DAD', '2020-09-07 00:00:37.000000', 4.0, 'Đã hủy');

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
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

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
INSERT INTO `giahangvetheocb` VALUES ('CB029', 'hv_pt', 10);

-- ----------------------------
-- Table structure for hangve
-- ----------------------------
DROP TABLE IF EXISTS `hangve`;
CREATE TABLE `hangve`  (
  `MaHangVe` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `TenHangVe` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`MaHangVe`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

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
  `idHoaDon` int(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `NgayMua` datetime(6) NOT NULL,
  `GiaVe` double(255, 0) NOT NULL,
  `maKH` int(0) UNSIGNED NOT NULL,
  `MaSoVe` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`idHoaDon`) USING BTREE,
  INDEX `maKH`(`maKH`) USING BTREE,
  INDEX `hoadonmuave_ibfk_2`(`MaSoVe`) USING BTREE,
  CONSTRAINT `hoadonmuave_ibfk_1` FOREIGN KEY (`maKH`) REFERENCES `khachhang` (`maKH`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `hoadonmuave_ibfk_2` FOREIGN KEY (`MaSoVe`) REFERENCES `vechuyenbay` (`MaSoVe`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of hoadonmuave
-- ----------------------------
INSERT INTO `hoadonmuave` VALUES (1, '2020-08-26 20:47:23.368000', 450000, 1, 'CB001PTV0002');
INSERT INTO `hoadonmuave` VALUES (2, '2020-08-26 20:47:23.462000', 450000, 2, 'CB001PTV0001');
INSERT INTO `hoadonmuave` VALUES (3, '2020-07-22 20:52:16.000000', 500000, 3, 'CB005PTV0002');
INSERT INTO `hoadonmuave` VALUES (4, '2020-08-26 20:52:16.041000', 500000, 4, 'CB005PTV0001');
INSERT INTO `hoadonmuave` VALUES (5, '2020-08-26 20:54:11.182000', 600000, 5, 'CB009PTV0001');

-- ----------------------------
-- Table structure for khachhang
-- ----------------------------
DROP TABLE IF EXISTS `khachhang`;
CREATE TABLE `khachhang`  (
  `maKH` int(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `HoTen` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `SDT` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `GioiTinh` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `NgaySinh` date NULL DEFAULT NULL,
  PRIMARY KEY (`maKH`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

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
  `maKH` int(0) UNSIGNED NOT NULL,
  `QuocTich` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `HoChieu` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`maKH`) USING BTREE,
  CONSTRAINT `khachnuocngoai_ibfk_1` FOREIGN KEY (`maKH`) REFERENCES `khachhang` (`maKH`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

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
  `maKH` int(0) UNSIGNED NOT NULL,
  `CMND` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `NgheNghiep` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `DiaChi` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`maKH`) USING BTREE,
  CONSTRAINT `khachvietnam_ibfk_1` FOREIGN KEY (`maKH`) REFERENCES `khachhang` (`maKH`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

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
  `idCapNhat` int(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `MaCB` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `MaHangVe` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `NgayCapNhat` datetime(6) NOT NULL,
  `GiaCapNhat` double(255, 0) NOT NULL,
  PRIMARY KEY (`idCapNhat`) USING BTREE,
  INDEX `MaCB`(`MaCB`, `MaHangVe`) USING BTREE,
  CONSTRAINT `lichsugiahangvecb_ibfk_1` FOREIGN KEY (`MaCB`, `MaHangVe`) REFERENCES `giahangvetheocb` (`MaCB`, `MaHangVe`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of lichsugiahangvecb
-- ----------------------------

-- ----------------------------
-- Table structure for nhanvien
-- ----------------------------
DROP TABLE IF EXISTS `nhanvien`;
CREATE TABLE `nhanvien`  (
  `idNhanVien` int(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `HoTen` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `GioiTinh` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `NgaySinh` date NULL DEFAULT NULL,
  `SDT` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `CMND` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `Email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `TrangThai` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`idNhanVien`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of nhanvien
-- ----------------------------
INSERT INTO `nhanvien` VALUES (1, 'Trần Phúc Hưng', 'Nam', '1995-06-12', '0352201193', '3403928338', 'tphung@gmail.com', 'Đang hoạt động');
INSERT INTO `nhanvien` VALUES (2, 'Nguyễn Hải Đăng', 'Nam', '1990-11-20', '0232901893', '2914309302', 'nhdang.something@gmail.com', 'Đang hoạt động');
INSERT INTO `nhanvien` VALUES (3, 'Trần Linh Chi', 'Nữ', '1992-04-09', '0542019292', '2323239209', 'tlchi2030@gmail.com', 'Đang hoạt động');
INSERT INTO `nhanvien` VALUES (4, 'Lê Việt Hà', 'Nữ', '1995-04-20', '0409340930', '3974027292', 'lvha1001@gmail.com', 'Đang hoạt động');
INSERT INTO `nhanvien` VALUES (5, 'Đỗ Hà Linh', 'Nam', '1989-10-20', '0293024753', '3294720929', 'dohalinh@gmail.com', 'Nghỉ việc');
INSERT INTO `nhanvien` VALUES (6, 'Vũ Đặng Hoàng Vũ', 'Nam', '1995-02-21', '0783928229', '5920229202', 'vdhvu@gmail.com', 'Đang hoạt động');
INSERT INTO `nhanvien` VALUES (7, 'Nguyễn Hoàng Vy', 'Nữ', '1993-08-30', '0920392029', '2039203929', 'nhoangvy@gmail.com', 'Nghỉ việc');
INSERT INTO `nhanvien` VALUES (8, 'Phạm Minh Hiển', 'Nam', '1998-01-01', '0232484829', '3973820239', 'pmhien@gmail.com', 'Đang hoạt động');
INSERT INTO `nhanvien` VALUES (9, 'Bùi Đức Kiên', 'Nam', '1992-07-20', '0302929032', '4920292020', 'bdkien.bdkien@gmail.com', 'Đang hoạt động');
INSERT INTO `nhanvien` VALUES (10, 'Lê My', 'Nữ', '1994-03-20', '0392929201', '3920292833', 'lemy2020@gmail.com', 'Đang hoạt động');
INSERT INTO `nhanvien` VALUES (11, 'Nguyễn Anh Hào', 'Nam', '1995-08-09', '039202928', '4030029292', 'hao.nguyenanh@gmail.com', 'Đang hoạt động');
INSERT INTO `nhanvien` VALUES (12, 'Trịnh Hoàng Khánh Duy', 'Nam', '1995-03-03', '034823293', '3920209303', 'thkduy@gmail.com', 'Đang hoạt động');

-- ----------------------------
-- Table structure for nvbanve
-- ----------------------------
DROP TABLE IF EXISTS `nvbanve`;
CREATE TABLE `nvbanve`  (
  `idNhanVien` int(0) UNSIGNED NOT NULL,
  PRIMARY KEY (`idNhanVien`) USING BTREE,
  CONSTRAINT `nvbanve_ibfk_1` FOREIGN KEY (`idNhanVien`) REFERENCES `nhanvien` (`idNhanVien`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of nvbanve
-- ----------------------------
INSERT INTO `nvbanve` VALUES (1);
INSERT INTO `nvbanve` VALUES (2);
INSERT INTO `nvbanve` VALUES (3);
INSERT INTO `nvbanve` VALUES (4);
INSERT INTO `nvbanve` VALUES (5);
INSERT INTO `nvbanve` VALUES (6);
INSERT INTO `nvbanve` VALUES (7);
INSERT INTO `nvbanve` VALUES (8);
INSERT INTO `nvbanve` VALUES (9);
INSERT INTO `nvbanve` VALUES (10);

-- ----------------------------
-- Table structure for phieu
-- ----------------------------
DROP TABLE IF EXISTS `phieu`;
CREATE TABLE `phieu`  (
  `idPhieu` int(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `NgayDat` datetime(6) NOT NULL,
  `TinhTrang` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `maKH` int(0) UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY (`idPhieu`) USING BTREE,
  INDEX `maKH`(`maKH`) USING BTREE,
  CONSTRAINT `phieu_ibfk_1` FOREIGN KEY (`maKH`) REFERENCES `khachhang` (`maKH`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

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
  `idPhieu` int(0) UNSIGNED NOT NULL,
  `maCB` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`idPhieu`) USING BTREE,
  INDEX `maCB`(`maCB`) USING BTREE,
  CONSTRAINT `phieucho_ibfk_1` FOREIGN KEY (`idPhieu`) REFERENCES `phieu` (`idPhieu`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `phieucho_ibfk_2` FOREIGN KEY (`maCB`) REFERENCES `chuyenbay` (`MaCB`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

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
  `idPhieu` int(0) UNSIGNED NOT NULL,
  `MaSoVe` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`idPhieu`) USING BTREE,
  INDEX `MaSoVe`(`MaSoVe`) USING BTREE,
  CONSTRAINT `phieudatcho_ibfk_1` FOREIGN KEY (`idPhieu`) REFERENCES `phieu` (`idPhieu`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `phieudatcho_ibfk_2` FOREIGN KEY (`MaSoVe`) REFERENCES `vechuyenbay` (`MaSoVe`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of phieudatcho
-- ----------------------------
INSERT INTO `phieudatcho` VALUES (1, 'CB001DBV0001');
INSERT INTO `phieudatcho` VALUES (2, 'CB003PTV0001');

-- ----------------------------
-- Table structure for quydinh
-- ----------------------------
DROP TABLE IF EXISTS `quydinh`;
CREATE TABLE `quydinh`  (
  `idQuyDinh` int(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `TenQuyDinh` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `Kieu` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `GiaTri` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `TinhTrang` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`idQuyDinh`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of quydinh
-- ----------------------------
INSERT INTO `quydinh` VALUES (1, 'Thời hạn hủy vé trước giờ bay', 'Giờ', '24', 'Còn hiệu lực');
INSERT INTO `quydinh` VALUES (2, 'Thời hạn đặt vé trước giờ bay', 'Giờ', '48', 'Còn hiệu lực');
INSERT INTO `quydinh` VALUES (3, 'Số sân bay trung gian tối đa', 'Số lượng', '5', 'Còn hiệu lực');
INSERT INTO `quydinh` VALUES (4, 'Thời gian dừng tối thiểu', 'Giờ', '1', 'Còn hiệu lực');
INSERT INTO `quydinh` VALUES (5, 'Thời gian dừng tối đa', 'Giờ', '3', 'Còn hiệu lực');

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
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

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
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sanbaytrunggian
-- ----------------------------
INSERT INTO `sanbaytrunggian` VALUES ('CB006', 'ICN', 2.5, 'Tiếp nhiên liệu');
INSERT INTO `sanbaytrunggian` VALUES ('CB007', 'MEL', 1.0, 'Tiếp nhiên liệu');
INSERT INTO `sanbaytrunggian` VALUES ('CB008', 'DAD', 2.5, NULL);
INSERT INTO `sanbaytrunggian` VALUES ('CB008', 'HKG', 1.0, NULL);
INSERT INTO `sanbaytrunggian` VALUES ('CB008', 'ICN', 3.0, NULL);
INSERT INTO `sanbaytrunggian` VALUES ('CB044', 'DAD', 2.0, NULL);
INSERT INTO `sanbaytrunggian` VALUES ('CB044', 'ICN', 1.5, NULL);

-- ----------------------------
-- Table structure for taikhoan
-- ----------------------------
DROP TABLE IF EXISTS `taikhoan`;
CREATE TABLE `taikhoan`  (
  `idNhanVien` int(0) UNSIGNED NOT NULL,
  `TenTaiKhoan` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `MatKhau` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`idNhanVien`) USING BTREE,
  CONSTRAINT `taikhoan_ibfk_1` FOREIGN KEY (`idNhanVien`) REFERENCES `nhanvien` (`idNhanVien`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of taikhoan
-- ----------------------------
INSERT INTO `taikhoan` VALUES (1, 'tphung', '12345678');
INSERT INTO `taikhoan` VALUES (2, 'nhdang', '12345678');
INSERT INTO `taikhoan` VALUES (3, 'tlchi', '12345678');
INSERT INTO `taikhoan` VALUES (4, 'lvha', '12345678');
INSERT INTO `taikhoan` VALUES (5, 'dhlinh', '12345678');
INSERT INTO `taikhoan` VALUES (6, 'vdhvu', '12345678');
INSERT INTO `taikhoan` VALUES (7, 'nhvy', '12345678');
INSERT INTO `taikhoan` VALUES (8, 'pmhien', '12345678');
INSERT INTO `taikhoan` VALUES (9, 'bdkien', '12345678');
INSERT INTO `taikhoan` VALUES (10, 'lemy', '12345678');
INSERT INTO `taikhoan` VALUES (11, 'nahao', '12345678');
INSERT INTO `taikhoan` VALUES (12, 'thkduy', '12345678');

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
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of vechuyenbay
-- ----------------------------
INSERT INTO `vechuyenbay` VALUES ('CB001DBV0001', 'Đã được đặt', 'CB001', 'hv_ptdb');
INSERT INTO `vechuyenbay` VALUES ('CB001DBV0002', 'Chưa được mua', 'CB001', 'hv_ptdb');
INSERT INTO `vechuyenbay` VALUES ('CB001DBV0003', 'Chưa được mua', 'CB001', 'hv_ptdb');
INSERT INTO `vechuyenbay` VALUES ('CB001PTV0001', 'Đã được mua', 'CB001', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB001PTV0002', 'Đã được mua', 'CB001', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB001PTV0003', 'Chưa được mua', 'CB001', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB001PTV0004', 'Chưa được mua', 'CB001', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB001PTV0005', 'Chưa được mua', 'CB001', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB001TGV0001', 'Chưa được mua', 'CB007', 'hv_tg');
INSERT INTO `vechuyenbay` VALUES ('CB002PTV0001', 'Chưa được mua', 'CB002', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB002TGV0001', 'Chưa được mua', 'CB002', 'hv_tg');
INSERT INTO `vechuyenbay` VALUES ('CB003PTV0001', 'Đã được đặt', 'CB003', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB004DBV0001', 'Chưa được mua', 'CB004', 'hv_ptdb');
INSERT INTO `vechuyenbay` VALUES ('CB004PTV0001', 'Chưa được mua', 'CB004', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB005PTV0001', 'Đã được mua', 'CB005', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB005PTV0002', 'Đã được mua', 'CB005', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB006DBV0001', 'Chưa được mua', 'CB006', 'hv_ptdb');
INSERT INTO `vechuyenbay` VALUES ('CB006PTV0001', 'Chưa được mua', 'CB006', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB007DBV0001', 'Chưa được mua', 'CB007', 'hv_ptdb');
INSERT INTO `vechuyenbay` VALUES ('CB008PTV0001', 'Chưa được mua', 'CB008', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB008TGV0001', 'Chưa được mua', 'CB008', 'hv_tg');
INSERT INTO `vechuyenbay` VALUES ('CB009PTV0001', 'Đã được mua', 'CB009', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB009PTV0002', 'Chưa được mua', 'CB009', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB010DBV0001', 'Chưa được mua', 'CB010', 'hv_ptdb');
INSERT INTO `vechuyenbay` VALUES ('CB010PTV0001', 'Chưa được mua', 'CB010', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB010PTV0002', 'Đã được mua', 'CB010', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB029PTV0001', 'Chưa được mua', 'CB029', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB029PTV0002', 'Chưa được mua', 'CB029', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB029PTV0003', 'Chưa được mua', 'CB029', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB029PTV0004', 'Chưa được mua', 'CB029', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB045DBV0001', 'Chưa được mua', 'CB045', 'hv_ptdb');
INSERT INTO `vechuyenbay` VALUES ('CB045DBV0002', 'Chưa được mua', 'CB045', 'hv_ptdb');
INSERT INTO `vechuyenbay` VALUES ('CB045DBV0003', 'Chưa được mua', 'CB045', 'hv_ptdb');
INSERT INTO `vechuyenbay` VALUES ('CB045DBV0004', 'Chưa được mua', 'CB045', 'hv_ptdb');
INSERT INTO `vechuyenbay` VALUES ('CB045PTV0001', 'Chưa được mua', 'CB045', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB045PTV0002', 'Chưa được mua', 'CB045', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB045PTV0003', 'Chưa được mua', 'CB045', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB045PTV0004', 'Đã được mua', 'CB045', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB045PTV0005', 'Chưa được mua', 'CB045', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB045PTV0006', 'Chưa được mua', 'CB045', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB045PTV0007', 'Chưa được mua', 'CB045', 'hv_pt');
INSERT INTO `vechuyenbay` VALUES ('CB045TGV0001', 'Chưa được mua', 'CB045', 'hv_tg');
INSERT INTO `vechuyenbay` VALUES ('CB045TGV0002', 'Chưa được mua', 'CB045', 'hv_tg');

SET FOREIGN_KEY_CHECKS = 1;
