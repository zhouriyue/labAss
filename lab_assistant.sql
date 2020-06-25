/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : lab_assistant

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2020-06-09 21:20:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for employ
-- ----------------------------
DROP TABLE IF EXISTS `employ`;
CREATE TABLE `employ` (
  `rec_plan_id` varchar(50) NOT NULL,
  `user_id` varchar(50) NOT NULL,
  `rec_plan_name` varchar(50) DEFAULT NULL,
  `post_name` varchar(50) DEFAULT NULL,
  `lab_id` varchar(50) DEFAULT NULL,
  `lab_name` varchar(50) DEFAULT NULL,
  `technica` varchar(255) DEFAULT NULL,
  `stu_id` varchar(50) DEFAULT NULL,
  `stu_name` varchar(50) DEFAULT NULL,
  `major_id` varchar(50) DEFAULT NULL,
  `inst_id` varchar(50) DEFAULT NULL,
  `class_id` varchar(50) DEFAULT NULL,
  `grade` varchar(50) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `per_pic` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`rec_plan_id`,`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employ
-- ----------------------------
INSERT INTO `employ` VALUES ('3a59937f-85a7-46b1-9cfb-ef0f91322f90', 'zhouriyue', '50', '50', '第一实验室', '第一实验室', '无', '201700208131', '周日月', '软件工程', '大数据与软件工程', '1班', '2017', '18307884395', '1742204618@qq.com', '');

-- ----------------------------
-- Table structure for enroll_info
-- ----------------------------
DROP TABLE IF EXISTS `enroll_info`;
CREATE TABLE `enroll_info` (
  `en_info_id` varchar(255) NOT NULL,
  `en_info_time` varchar(255) DEFAULT NULL,
  `technica` varchar(255) DEFAULT NULL,
  `lab_id` varchar(50) DEFAULT NULL,
  `lab_name` varchar(255) DEFAULT NULL,
  `rec_plan_id` varchar(50) NOT NULL,
  `user_id` varchar(50) NOT NULL,
  PRIMARY KEY (`en_info_id`,`rec_plan_id`,`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of enroll_info
-- ----------------------------
INSERT INTO `enroll_info` VALUES ('36da874b-8fc4-4003-bcc9-31281d95f771', '2020-06-08 00:05:29', '', '3', '3', '4e59beae-827e-458e-a13c-f9389929625c', 'zhouriyue');
INSERT INTO `enroll_info` VALUES ('3ae3c7d9-9ea6-4e49-9c68-4d9bd3ffa8ee', '2020-06-08 00:07:55', '有', '第二实验室', '第二实验室', 'b909e7af-4cdd-40fa-bc71-6545f5d25319', 'zhouriyue');
INSERT INTO `enroll_info` VALUES ('50730379-7571-483b-9b9f-84677d6ec980', '2020-06-08 00:05:30', '', '3', '3', '4e59beae-827e-458e-a13c-f9389929625c', 'zhouriyue');
INSERT INTO `enroll_info` VALUES ('70a29d9a-8b10-46c4-97d5-dcd9e096859b', '2020-06-08 00:15:22', '', '第二实验室', '第二实验室', '9afa2d99-bd7a-4ccf-b28b-002f2bccb823', 'zhouriyue');
INSERT INTO `enroll_info` VALUES ('744b0168-1c47-44d0-9c6d-e5a3c93bbeb8', '2020-06-08 00:12:00', '', '第二实验室', '第二实验室', '58ca971e-8887-49de-9bd4-ec927d110f4b', 'zhouriyue');
INSERT INTO `enroll_info` VALUES ('7ccc5aeb-f99b-4b14-8045-44c7d1a195b3', '2020-06-08 00:12:13', '', '第二实验室', '第二实验室', '58ca971e-8887-49de-9bd4-ec927d110f4b', 'zhouriyue');
INSERT INTO `enroll_info` VALUES ('898ba001-8edb-4f97-aa6b-12ae6288de75', '2020-06-08 00:13:45', '', '第二实验室', '第二实验室', '58ca971e-8887-49de-9bd4-ec927d110f4b', 'zhouriyue');
INSERT INTO `enroll_info` VALUES ('9ee57de5-b9ef-4d50-9094-001268df5266', '2020-06-08 00:15:33', '', '第二实验室', '第二实验室', '9afa2d99-bd7a-4ccf-b28b-002f2bccb823', 'zhouriyue');

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `menu_id` varchar(50) NOT NULL,
  `menu_name` varchar(50) DEFAULT NULL,
  `menu_pid` varchar(30) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `icon` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('F01', '用户管理', 'F01', 'SysUserList', 'el-icon-document');
INSERT INTO `menu` VALUES ('F02', '系统管理', 'F01', 'SystemSet', 'el-icon-setting');
INSERT INTO `menu` VALUES ('F03', '工作内容', 'F01', 'WorkContentList', 'el-icon-date');
INSERT INTO `menu` VALUES ('F04', '招聘计划管理', 'F01', 'RecruitmentPlanList', 'el-icon-date');
INSERT INTO `menu` VALUES ('F05', '报名信息管理', 'F01', 'EnrollInfo', 'el-icon-setting');
INSERT INTO `menu` VALUES ('F06', '录入档案管理', 'F01', 'EmployList', 'el-icon-setting');
INSERT INTO `menu` VALUES ('F07', '维修申报', 'F01', 'RepairApplyList', 'el-icon-setting');
INSERT INTO `menu` VALUES ('F08', '菜单管理', 'F01', 'MenuList', 'el-icon-setting');

-- ----------------------------
-- Table structure for recruitment_plan
-- ----------------------------
DROP TABLE IF EXISTS `recruitment_plan`;
CREATE TABLE `recruitment_plan` (
  `rec_plan_id` varchar(50) NOT NULL,
  `rec_plan_name` varchar(255) DEFAULT NULL,
  `post_name` varchar(255) DEFAULT NULL,
  `rec_number` int(11) DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
  `lab_tach_name` varchar(255) DEFAULT NULL,
  `surplus_number` int(11) DEFAULT NULL,
  `audis` enum('驳回','未通过','通过') DEFAULT '未通过',
  `user_id` varchar(50) DEFAULT NULL,
  `lab_id` varchar(50) DEFAULT NULL,
  `lab_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`rec_plan_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of recruitment_plan
-- ----------------------------
INSERT INTO `recruitment_plan` VALUES ('4e59beae-827e-458e-a13c-f9389929625c', '333', '333', '6', '大数据', '赵海博', '6', '通过', 'zhaohaibo', '3', '3');
INSERT INTO `recruitment_plan` VALUES ('58ca971e-8887-49de-9bd4-ec927d110f4b', '444', '444', '4', '大数据', '赵海博', '0', '通过', 'zhaohaibo', '第二实验室', '第二实验室');
INSERT INTO `recruitment_plan` VALUES ('9afa2d99-bd7a-4ccf-b28b-002f2bccb823', '777', '777', '7', '大数据', '赵海博', '7', '通过', 'zhaohaibo', '第二实验室', '第二实验室');
INSERT INTO `recruitment_plan` VALUES ('b909e7af-4cdd-40fa-bc71-6545f5d25319', '333', '333', '3', '大数据', '赵海博', '3', '通过', 'zhaohaibo', '第二实验室', '第二实验室');

-- ----------------------------
-- Table structure for repair_apply
-- ----------------------------
DROP TABLE IF EXISTS `repair_apply`;
CREATE TABLE `repair_apply` (
  `rep_app_id` varchar(50) NOT NULL,
  `device_id` varchar(100) DEFAULT NULL,
  `device_name` varchar(100) DEFAULT NULL,
  `model_number` varchar(100) DEFAULT NULL,
  `hitch_depict` varchar(255) DEFAULT NULL,
  `repair_date` datetime DEFAULT NULL,
  `repair_name` varchar(50) DEFAULT NULL,
  `user_id` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`rep_app_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of repair_apply
-- ----------------------------
INSERT INTO `repair_apply` VALUES ('01', '01', '01', '01', '01', '2020-05-26 19:36:59', '01', 'zhaohaibo');

-- ----------------------------
-- Table structure for role_menu
-- ----------------------------
DROP TABLE IF EXISTS `role_menu`;
CREATE TABLE `role_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` varchar(50) DEFAULT NULL,
  `menu_id` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_menu
-- ----------------------------
INSERT INTO `role_menu` VALUES ('1', '超级管理员', 'F01');
INSERT INTO `role_menu` VALUES ('4', '实验室技术员', 'F04');
INSERT INTO `role_menu` VALUES ('5', '超级管理员', 'F04');
INSERT INTO `role_menu` VALUES ('6', '教务处', 'F04');
INSERT INTO `role_menu` VALUES ('7', '普通用户', 'F04');
INSERT INTO `role_menu` VALUES ('8', '实验室技术员', 'F05');
INSERT INTO `role_menu` VALUES ('9', '实验室技术员', 'F06');
INSERT INTO `role_menu` VALUES ('10', '实验室助理', 'F07');
INSERT INTO `role_menu` VALUES ('11', '实验室技术员', 'F03');
INSERT INTO `role_menu` VALUES ('12', '实验室助理', 'F02');
INSERT INTO `role_menu` VALUES ('13', '教务处', 'F02');
INSERT INTO `role_menu` VALUES ('14', '实验室技术员', 'F07');
INSERT INTO `role_menu` VALUES ('15', '普通用户', 'F02');
INSERT INTO `role_menu` VALUES ('16', '实验室技术员', 'F02');
INSERT INTO `role_menu` VALUES ('17', '超级管理员', 'F08');
INSERT INTO `role_menu` VALUES ('18', '超级管理员', 'F02');
INSERT INTO `role_menu` VALUES ('19', '实验室助理', 'F03');
INSERT INTO `role_menu` VALUES ('20', '实验室助理', 'F07');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` varchar(50) NOT NULL,
  `user_pwd` varchar(50) DEFAULT NULL,
  `stu_id` varchar(50) DEFAULT NULL,
  `stu_name` varchar(50) DEFAULT NULL,
  `major_id` varchar(50) DEFAULT NULL,
  `inst_id` varchar(50) DEFAULT NULL,
  `class_id` varchar(50) DEFAULT NULL,
  `grade` varchar(4) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `per_pic` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('admin', '123456', '201700208129', '管理员', '软件工程', '大数据与软件工程', '1班', '2017', '18307884396', '1742204618@qq.com', null);
INSERT INTO `sys_user` VALUES ('xiehong', '123456', '201700208116', '谢红', '软件工程', '大数据与软件工程', '1班', '2017', '18307884394', '1742204618@qq.com', null);
INSERT INTO `sys_user` VALUES ('zhaohaibo', '123456', '201700208130', '赵海博', '软件工程', '大数据与软件工程', '1班', '2017', '18307884395', '1742204618@qq.com', null);
INSERT INTO `sys_user` VALUES ('zhouriyue', '123456', '201700208131', '周日月', '软件工程', '大数据与软件工程', '1班', '2017', '18307884395', '1742204618@qq.com', null);

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `role_id` varchar(50) NOT NULL,
  `role_name` varchar(255) DEFAULT NULL,
  `fullname` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('1', '好的', '好的');
INSERT INTO `t_role` VALUES ('实验室助理', '1', '1');
INSERT INTO `t_role` VALUES ('实验室技术员', '2', '2');
INSERT INTO `t_role` VALUES ('教务处', '2', '2');
INSERT INTO `t_role` VALUES ('普通用户', '2', '2');
INSERT INTO `t_role` VALUES ('超级管理员', '2', '2');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(50) DEFAULT NULL,
  `role_id` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1', 'admin', '超级管理员');
INSERT INTO `user_role` VALUES ('2', 'zhaohaibo', '实验室技术员');
INSERT INTO `user_role` VALUES ('3', 'xiehong', '教务处');
INSERT INTO `user_role` VALUES ('4', 'zhouriyue', '普通用户');
INSERT INTO `user_role` VALUES ('5', 'zhouriyue', '实验室助理');

-- ----------------------------
-- Table structure for work_content
-- ----------------------------
DROP TABLE IF EXISTS `work_content`;
CREATE TABLE `work_content` (
  `work_id` varchar(50) NOT NULL,
  `week_number` int(4) DEFAULT NULL,
  `work_date` varchar(30) DEFAULT NULL,
  `week` varchar(10) DEFAULT NULL,
  `user_id` varchar(50) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `system_date` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`work_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of work_content
-- ----------------------------
INSERT INTO `work_content` VALUES ('01', '5', '2020-05-26 19:25:20', '星期无', 'zhaohaibo', '无故障', '1800');
