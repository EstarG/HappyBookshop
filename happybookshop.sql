/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50150
Source Host           : localhost:3306
Source Database       : happybookshop

Target Server Type    : MYSQL
Target Server Version : 50150
File Encoding         : 65001

Date: 2013-01-03 16:43:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `authors`
-- ----------------------------
DROP TABLE IF EXISTS `authors`;
CREATE TABLE `authors` (
  `authorId` int(11) NOT NULL AUTO_INCREMENT,
  `authorName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`authorId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of authors
-- ----------------------------
INSERT INTO `authors` VALUES ('1', '耿祥义');
INSERT INTO `authors` VALUES ('2', '张跃平');
INSERT INTO `authors` VALUES ('3', '郭宝星');
INSERT INTO `authors` VALUES ('4', '郑闯');
INSERT INTO `authors` VALUES ('5', '朱庆伟');
INSERT INTO `authors` VALUES ('6', '袁佑');
INSERT INTO `authors` VALUES ('7', '徐立红');

-- ----------------------------
-- Table structure for `booklinkauthors`
-- ----------------------------
DROP TABLE IF EXISTS `booklinkauthors`;
CREATE TABLE `booklinkauthors` (
  `bookLinkAuthorId` int(11) NOT NULL AUTO_INCREMENT,
  `bookId` int(11) DEFAULT NULL,
  `authorId` int(11) DEFAULT NULL,
  PRIMARY KEY (`bookLinkAuthorId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of booklinkauthors
-- ----------------------------
INSERT INTO `booklinkauthors` VALUES ('1', '1', '1');
INSERT INTO `booklinkauthors` VALUES ('2', '1', '2');
INSERT INTO `booklinkauthors` VALUES ('3', '2', '3');
INSERT INTO `booklinkauthors` VALUES ('4', '2', '4');
INSERT INTO `booklinkauthors` VALUES ('5', '3', '5');
INSERT INTO `booklinkauthors` VALUES ('6', '3', '6');
INSERT INTO `booklinkauthors` VALUES ('7', '4', '7');

-- ----------------------------
-- Table structure for `books`
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books` (
  `bookId` int(11) NOT NULL AUTO_INCREMENT,
  `bookName` varchar(255) DEFAULT NULL,
  `bookPublisher` varchar(255) DEFAULT NULL,
  `bookPrice` double DEFAULT NULL,
  `bookIsbn` varchar(255) DEFAULT NULL,
  `bookDetails` varchar(255) DEFAULT NULL,
  `bookPictureName` varchar(255) DEFAULT NULL,
  `bookType` int(11) DEFAULT NULL,
  PRIMARY KEY (`bookId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of books
-- ----------------------------
INSERT INTO `books` VALUES ('1', 'JAVA程序设计', '清华大学出版社', '34', '978-7-302-21352-9', '2世纪高等学校计算机专业实用教材，你行。', 'fengmian.gif', '1');
INSERT INTO `books` VALUES ('2', 'C#程序设计', '机械工业出版社', '35', '978-7-302-21352-10', '这是本好书啊,学他保你不挂科，你行。', 'ccc.bmp', '2');
INSERT INTO `books` VALUES ('3', '实践7个习惯', '中国青年出版社', '30', '978-7-302-21352-11', '高效能人士的七个习惯，你行。', 'book1.jpg', '1');
INSERT INTO `books` VALUES ('4', '雅思词汇', '高等教育出版社', '20', '978-7-302-21352-12', '只要你有这本书，雅思轻松过没问题，你行。', 'book2.jpg', '3');

-- ----------------------------
-- Table structure for `categorys`
-- ----------------------------
DROP TABLE IF EXISTS `categorys`;
CREATE TABLE `categorys` (
  `catId` int(11) NOT NULL DEFAULT '0',
  `catName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`catId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of categorys
-- ----------------------------
INSERT INTO `categorys` VALUES ('1', '小说');
INSERT INTO `categorys` VALUES ('2', '悬疑');
INSERT INTO `categorys` VALUES ('3', '言情');
INSERT INTO `categorys` VALUES ('4', '历史');
INSERT INTO `categorys` VALUES ('5', '社会');
INSERT INTO `categorys` VALUES ('6', '文学');
INSERT INTO `categorys` VALUES ('7', '文学 传记 艺术');
INSERT INTO `categorys` VALUES ('8', '青春');
INSERT INTO `categorys` VALUES ('9', '青春文学 电影 幽默');
INSERT INTO `categorys` VALUES ('10', '励志 修养 职场');
INSERT INTO `categorys` VALUES ('11', '童书');
INSERT INTO `categorys` VALUES ('12', '科学 英语 图画');
INSERT INTO `categorys` VALUES ('13', '生活 创意 旅行');
INSERT INTO `categorys` VALUES ('14', '人文社科');
INSERT INTO `categorys` VALUES ('15', '历史 文化 心理');
INSERT INTO `categorys` VALUES ('16', '科技 科普 农林');
INSERT INTO `categorys` VALUES ('17', '教育');
INSERT INTO `categorys` VALUES ('18', '教材');

-- ----------------------------
-- Table structure for `employees`
-- ----------------------------
DROP TABLE IF EXISTS `employees`;
CREATE TABLE `employees` (
  `employeeId` int(11) NOT NULL DEFAULT '0',
  `employeeName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`employeeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employees
-- ----------------------------
INSERT INTO `employees` VALUES ('1', '袁佑');
INSERT INTO `employees` VALUES ('2', '郭宝星');
INSERT INTO `employees` VALUES ('3', '郑闯');
INSERT INTO `employees` VALUES ('4', '朱庆伟');
INSERT INTO `employees` VALUES ('5', '徐立红');

-- ----------------------------
-- Table structure for `logs`
-- ----------------------------
DROP TABLE IF EXISTS `logs`;
CREATE TABLE `logs` (
  `logId` int(11) NOT NULL AUTO_INCREMENT,
  `userId` varchar(255) DEFAULT NULL,
  `logDate` date DEFAULT NULL,
  `logEvent` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`logId`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of logs
-- ----------------------------

-- ----------------------------
-- Table structure for `orderdetails`
-- ----------------------------
DROP TABLE IF EXISTS `orderdetails`;
CREATE TABLE `orderdetails` (
  `orderDetailId` int(11) NOT NULL AUTO_INCREMENT,
  `bookId` int(11) DEFAULT NULL,
  `bookNum` int(255) DEFAULT NULL,
  `orderId` int(11) DEFAULT NULL,
  PRIMARY KEY (`orderDetailId`)
) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orderdetails
-- ----------------------------

-- ----------------------------
-- Table structure for `orders`
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `orderId` int(11) NOT NULL AUTO_INCREMENT,
  `orderDate` date DEFAULT NULL,
  `orderTotal` double DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  PRIMARY KEY (`orderId`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) DEFAULT NULL,
  `userPassword` varchar(255) DEFAULT NULL,
  `userAuthority` varchar(255) DEFAULT NULL,
  `userAddr` varchar(255) DEFAULT NULL,
  `userPhoneNum` varchar(255) DEFAULT NULL,
  `userEmail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'gbx', 'gbx', '1', '山东淄博', '18766966666', 'gbaxo@163.com');
INSERT INTO `users` VALUES ('2', 'admin', 'admin', '2', '山东', '110', '110');
