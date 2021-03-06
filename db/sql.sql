use BOOK;

-- ----------------------------
-- Table structure for cbook
-- ----------------------------
DROP TABLE IF EXISTS `cbook`;
CREATE TABLE `cbook`  (
  `isbn` char(13) DEFAULT NULL,
  `class` varchar(64) DEFAULT NULL,
  `subclass` varchar(64) DEFAULT NULL,
  `name` varchar(128) DEFAULT NULL,
  `author` varchar(128) DEFAULT NULL,
  `price` float NULL DEFAULT NULL,
  `pubdate` date NULL DEFAULT NULL,
  `introduction` text
);

-- ----------------------------
-- Records of cbook
-- ----------------------------
INSERT INTO `cbook` VALUES ('9787302197966', '信息安全', '密码学', '密码学与网络安全（第2版）', '影印', 53, '2022-05-31', '本书以清晰的脉络、简洁的语言，介绍了各种加密技术、网络安全协议与实现技术等内容，包括各种对称密钥算法与AES，非对称密钥算法、数字签名与RSA，数字证书与公钥基础设施，Internet安全协议，用户认证与Kerberos，Java、.NET和操作系统的加密实现，网络安全、防火墙与VPN，并给出了具体的加密与安全的案例实现分析，是一本关于密码学与网络安全的理论结合实践的优秀教材。 【本书特点】 本书语言表达流畅、简洁，使本书的阅读不再枯燥。 全书多达425幅插图，极大地方便了读者的学习和理解。 全书提供了丰富的多项选择题、练习题、设计与编程题，有利于加深读者对所学知识的理解和掌握。 【作者介绍】 Atul Kahate在印度和世界IT业中已经有12年的工作经验，他取得了统计学学士学位和计算机系统专业的MBA学位。他与他人为Tata McGraw-Hill出版公司合著了多部著作，不少书被用作教材或全世界的大学/学院/IT公司用作参考书。Atul Kahate还在印度和国外获得过多个奖项，过去曾就职于Syntel、L&T Infotech American Express和德国银行，现就职于i-flex solution有限公司。 ');
INSERT INTO `cbook` VALUES ('9787302256465', '信息安全', '概论', '密码学原理及应用技术', '张健', 19, '2022-06-01', '应用密码技术是网络安全和信息安全中的关键技术，它主要用于实现信息的保密性、完整性和不可否认性。本书内容包括密码算法及其在诸多方面的应用，如分组密码体制、公钥密码体制、序列密码体制等算法以及密码学在网络安全、电子邮件、电子商务和图像加密中的应用等，全书语言简练，通俗易懂，重点突出。 本书是作者在多年教学和科研工作基础上撰写而成的，可以作为高等学校计算机、通信工程、信息安全等专业的本科生和硕士生教材，也可以供相关领域的研究人员及工程技术人员参考。');
INSERT INTO `cbook` VALUES ('9787302183242', '信息安全', '概论', '信息隐藏原理及应用', '葛秀慧', 18, '2022-06-01', '本书全面系统地论述了信息隐藏的概念、分类、应用、理论与原理。书中重点介绍了信息隐藏的基本原理，并分析了与其相关的典型算法，以丰富的实例进行说明，同时提供了部分源代码。另外还详细讨论了数字水印技术与算法，探讨了隐写分析与隐蔽通信。 本书可以作为计算机应用、网络工程、通信与信息系统、信号与处理、信息安全与密码学、电子商务专业的本科生和研究生的教材，也可供从事信息安全研究及应用的学者、技术人员参考。');
INSERT INTO `cbook` VALUES ('9787302222019', '信息安全', '概论', '计算机信息安全管理实验教程', '魏红芹', 16, '2022-05-01', '本实验教材面向计算机和管理交叉类专业学生，从信息安全管理的角度出发，对信息系统整体安全体系进行分析和实验设计。书中针对技术基础和综合安全管理两个方面设计了详细实用的学习和练习手册，体现了“技术与管理”并重的信息安全观念，使得读者可以获得较为全面的专业技能，也便于教师根据课程进行选用。全书共包括5章、27个实验，涵盖了操作系统平台安全、网络安全、计算机病毒防治、应用系统安全、信息系统综合安全管理等领域。对于每个实验书中都给出了详尽的操作步骤说明和图示，容易理解和掌握。另外，还对各实验进行分析总结，便于使用者对实验举一反三，深入思考。 本书适合信息管理与信息系统、电子商务及计算机等专业学生及企业信息系统安全管理人员使用。');
INSERT INTO `cbook` VALUES ('9787302246824', '信息安全', '病毒防护', '电脑黑客攻防技巧总动员', '企鹅工作室、王礼龙', 39, '2022-03-01', '本书主要针对初、中级读者的需求，从零开始、系统全面地讲解了电脑黑客攻防的相关技巧。 全书共分为14个专题、两个附录，主要内容包括：黑客攻防必修基本技巧，常用黑客防御技巧，Windows系统漏洞入侵防御技巧，电脑系统安全防御技巧，清除电脑使用痕迹更安全，学会电脑中的隐藏技巧，巧用加密技术防御黑客、木马入侵技巧，木马攻防实战技巧，远程控制和黑客扫描技巧，系统和数据备份、恢复独家技巧，病毒彻底查杀高级技巧，防火墙安全防御技巧，电脑上网安全防御技巧，常用黑客命令和常见木马端口等。 本书具有内容精炼、技巧实用，实例丰富、通俗易懂，图文并茂、以图析文，版式精美、双色印刷，配套光盘、互补学习的特点。本书及配套多媒体光盘非常适合初、中级读者选用，也可以作为高职高专相关专业和电脑短训班的培训教材。 ');
INSERT INTO `cbook` VALUES ('9787302244011', '信息安全', '病毒防护', '计算机病毒与防范技术', '赖英旭、钟玮、李健、杨震等', 26, '2022-06-01', NULL);

-- ----------------------------
-- Table structure for cuser
-- ----------------------------
DROP TABLE IF EXISTS `cuser`;
CREATE TABLE `cbook`  (
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  primary key (`username`)
);

-- ----------------------------
-- Records of cuser
-- ----------------------------
INSERT INTO `cuser`(username, password) VALUES ('admin', 'admin');