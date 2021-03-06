
#
# TABLE STRUCTURE FOR: students
#

DROP TABLE IF EXISTS `students`;

CREATE TABLE `students` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CNP` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `study_group` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `address` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `students` (`id`, `name`, `CNP`, `study_group`, `email`, `user`, `address`, `password`) VALUES ('1', 'Reggie Dickens', '8143501', '39158', 'reilly.aurelie@example.org', 'windler.eden', '0352 Stiedemann Square Suite 568\nLake Gretchen, VT', 'cc18127d876119388e30');
INSERT INTO `students` (`id`, `name`, `CNP`, `study_group`, `email`, `user`, `address`, `password`) VALUES ('2', 'Jackie Hermann', '5677686', '12197', 'taryn.ryan@example.net', 'kassulke.garnett', '162 Becker Walks\nNorth Karelle, MD 98848-5411', 'a6152121f9c94b6f6509');
INSERT INTO `students` (`id`, `name`, `CNP`, `study_group`, `email`, `user`, `address`, `password`) VALUES ('3', 'Tressie Sawayn V', '1494211', '27817', 'caleigh26@example.net', 'brenda.glover', '2301 Zoila Field Apt. 938\nHuelland, CO 23069-7536', 'dbd2504fca7bd9b4bf00');
INSERT INTO `students` (`id`, `name`, `CNP`, `study_group`, `email`, `user`, `address`, `password`) VALUES ('4', 'Emily Hayes', '3541544', '33622', 'rosalia.stoltenberg@example.net', 'stamm.alf', '10512 Hills Street\nWest Katelin, OK 57888-6670', '82797e80f33ee174f22c');
INSERT INTO `students` (`id`, `name`, `CNP`, `study_group`, `email`, `user`, `address`, `password`) VALUES ('5', 'Miss Leann Runte III', '3887837', '14298', 'volkman.linda@example.net', 'fprice', '690 Keebler Fords\nPort Kennithport, OR 32467', 'cd8773b67dcf3e681ce2');
INSERT INTO `students` (`id`, `name`, `CNP`, `study_group`, `email`, `user`, `address`, `password`) VALUES ('6', 'Prof. Andrew Gibson I', '8547691', '39938', 'ubaldo00@example.com', 'prohaska.tyrese', '99310 Miller Villages\nNorth Isac, SD 56730-7916', '62eb625d175a45b6a4b9');
INSERT INTO `students` (`id`, `name`, `CNP`, `study_group`, `email`, `user`, `address`, `password`) VALUES ('7', 'Nakia Weissnat', '4901476', '29306', 'violette53@example.net', 'jarred.bode', '1534 Dicki Lock\nWest Madaline, KY 10932-6775', '11172399b2812ad734cd');
INSERT INTO `students` (`id`, `name`, `CNP`, `study_group`, `email`, `user`, `address`, `password`) VALUES ('8', 'Hyman Miller', '8241921', '31996', 'stehr.stanley@example.com', 'marcelle43', '556 Gerald Turnpike\nKundeland, IL 45209', 'dcf6fe5fedeb6a2154e2');
INSERT INTO `students` (`id`, `name`, `CNP`, `study_group`, `email`, `user`, `address`, `password`) VALUES ('9', 'Mr. Lafayette Sanford IV', '2624294', '25566', 'kbahringer@example.org', 'stiedemann.abbigail', '143 Jarrett Terrace\nWillaport, CT 20855', 'd1ea65c2bc45ade87193');
INSERT INTO `students` (`id`, `name`, `CNP`, `study_group`, `email`, `user`, `address`, `password`) VALUES ('10', 'Judson Jakubowski', '9529035', '20426', 'qspinka@example.org', 'rogahn.reece', '9369 Kunde Village\nHiltonborough, WV 20145', '7d55f543264289aac088');
INSERT INTO `students` (`id`, `name`, `CNP`, `study_group`, `email`, `user`, `address`, `password`) VALUES ('11', 'Gerson Weber', '4455458', '39591', 'cortez15@example.com', 'ariel.kub', '40849 Mayer Glens Apt. 155\nNorth Everett, NH 25054', '527faf0b99371d17be4a');
INSERT INTO `students` (`id`, `name`, `CNP`, `study_group`, `email`, `user`, `address`, `password`) VALUES ('12', 'Royal Schinner', '6678070', '28307', 'dorian.turner@example.org', 'mcummerata', '8783 Dandre Fields\nReginaldmouth, NC 27009', '30a8a5bb4a1cc49669ef');
INSERT INTO `students` (`id`, `name`, `CNP`, `study_group`, `email`, `user`, `address`, `password`) VALUES ('13', 'Ms. Earlene Medhurst PhD', '7182384', '22181', 'margaret43@example.org', 'west.aaliyah', '1263 DuBuque Islands\nSouth Jolieville, MD 70187', 'f7ae32e94d75f025d763');
INSERT INTO `students` (`id`, `name`, `CNP`, `study_group`, `email`, `user`, `address`, `password`) VALUES ('14', 'Dr. Trever Botsford II', '8160515', '12754', 'schiller.caterina@example.org', 'manley26', '93906 Taya Springs\nLake Lane, TX 16058-3792', '909f2442675eec30b3dc');
INSERT INTO `students` (`id`, `name`, `CNP`, `study_group`, `email`, `user`, `address`, `password`) VALUES ('15', 'Dr. Gwendolyn Corkery', '2347677', '33843', 'langworth.woodrow@example.net', 'giovanny37', '32057 Tremblay Roads\nJonshire, WA 11320-7464', 'f90eb9c8db6205070f7f');
INSERT INTO `students` (`id`, `name`, `CNP`, `study_group`, `email`, `user`, `address`, `password`) VALUES ('16', 'Riley Hettinger', '5805263', '10334', 'gregorio23@example.net', 'fpadberg', '4588 Watsica Freeway\nTayamouth, NV 06412', '22433ae4d2982d86c63d');
INSERT INTO `students` (`id`, `name`, `CNP`, `study_group`, `email`, `user`, `address`, `password`) VALUES ('17', 'Marisa Heathcote', '1616647', '15048', 'brekke.laurence@example.net', 'xmayert', '349 Cole Extensions\nParisianberg, IL 68343', 'e2ca7078332c105049a2');
INSERT INTO `students` (`id`, `name`, `CNP`, `study_group`, `email`, `user`, `address`, `password`) VALUES ('18', 'Christiana Muller II', '2173441', '14544', 'olson.ophelia@example.org', 'bernier.concepcion', '49907 Harvey Ridges\nVeumside, OH 33333-2041', '505067c156626550bf0f');
INSERT INTO `students` (`id`, `name`, `CNP`, `study_group`, `email`, `user`, `address`, `password`) VALUES ('19', 'Brain Jenkins I', '2290509', '20168', 'rebecca75@example.com', 'letitia.swaniawski', '118 Reva Gateway\nJaneview, NY 82353-8707', '60cbf556c829b1ef1186');
INSERT INTO `students` (`id`, `name`, `CNP`, `study_group`, `email`, `user`, `address`, `password`) VALUES ('20', 'Dr. Minerva Sauer II', '6829267', '28815', 'gulgowski.jarrett@example.com', 'destiney.ratke', '34622 Dejon Ports Apt. 275\nWest Berniceshire, NY 8', '9c1f9a060b5269c54499');


#
# TABLE STRUCTURE FOR: teachers
#

DROP TABLE IF EXISTS `teachers`;

CREATE TABLE `teachers` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `teachers` (`id`, `email`, `user`, `password`, `name`) VALUES ('1', 'christiansen.ted@example.net', 'tboehm', '777c76e1a8ac761a19d0', 'Dora Jones');
INSERT INTO `teachers` (`id`, `email`, `user`, `password`, `name`) VALUES ('2', 'delfina81@example.org', 'johnpaul50', '1d1d186855bd276064a4', 'Pink Russel I');
INSERT INTO `teachers` (`id`, `email`, `user`, `password`, `name`) VALUES ('3', 'klein.katlyn@example.com', 'marquardt.jettie', 'c01e5e48607f033ece69', 'Kenyon Connelly');
INSERT INTO `teachers` (`id`, `email`, `user`, `password`, `name`) VALUES ('4', 'bailey.josue@example.org', 'smiller', 'dbaff4f6542d17d27060', 'Mylene Denesik');
INSERT INTO `teachers` (`id`, `email`, `user`, `password`, `name`) VALUES ('5', 'elyssa45@example.com', 'kirlin.joannie', '1bae288abf73facd6a23', 'Leonel Fritsch');
INSERT INTO `teachers` (`id`, `email`, `user`, `password`, `name`) VALUES ('6', 'lesly13@example.net', 'hyman21', '61801b129aa9c71c7934', 'Tiffany Connelly');
INSERT INTO `teachers` (`id`, `email`, `user`, `password`, `name`) VALUES ('7', 'eladio.emmerich@example.org', 'ehowell', 'a0438909e72faa0a34c8', 'Ms. Sydnee Okuneva P');
INSERT INTO `teachers` (`id`, `email`, `user`, `password`, `name`) VALUES ('8', 'nayeli.kunde@example.org', 'alda.gutkowski', 'fc1b31f26ad8392e4ca8', 'Dr. Gus Armstrong');
INSERT INTO `teachers` (`id`, `email`, `user`, `password`, `name`) VALUES ('9', 'koelpin.amber@example.net', 'santino13', '99f69568fbb91b3f20ed', 'Alize Pfeffer');
INSERT INTO `teachers` (`id`, `email`, `user`, `password`, `name`) VALUES ('10', 'zemard@example.net', 'vladimir52', 'e492d35a209b37601b37', 'Daryl Quigley');
INSERT INTO `teachers` (`id`, `email`, `user`, `password`, `name`) VALUES ('11', 'trinity.stanton@example.net', 'mosciski.juliana', '739521268956021b08d5', 'Princess Konopelski ');
INSERT INTO `teachers` (`id`, `email`, `user`, `password`, `name`) VALUES ('12', 'kessler.jefferey@example.org', 'vchristiansen', '40534f1a789102ba23bc', 'Marge Torphy');
INSERT INTO `teachers` (`id`, `email`, `user`, `password`, `name`) VALUES ('13', 'spencer91@example.com', 'yazmin74', '3043dcf496e8a572d58d', 'Giles Hills Jr.');
INSERT INTO `teachers` (`id`, `email`, `user`, `password`, `name`) VALUES ('14', 'kuvalis.rosalee@example.com', 'richard72', 'be75c356b070d9208a62', 'Dr. Sydni Mertz II');
INSERT INTO `teachers` (`id`, `email`, `user`, `password`, `name`) VALUES ('15', 'dallas.mcglynn@example.org', 'sincere32', '89a424e916650971c727', 'Carlotta Reichel');
INSERT INTO `teachers` (`id`, `email`, `user`, `password`, `name`) VALUES ('16', 'kgrant@example.org', 'imurphy', 'f8e719f567d9e68f6f22', 'Casper Kunde');
INSERT INTO `teachers` (`id`, `email`, `user`, `password`, `name`) VALUES ('17', 'robel.edmund@example.org', 'conn.cecile', 'c9718f55028f4a55228f', 'Turner Herzog');
INSERT INTO `teachers` (`id`, `email`, `user`, `password`, `name`) VALUES ('18', 'camren.langworth@example.com', 'cassin.maureen', '6094d84153c4c3092faf', 'Dr. Hallie Zboncak');
INSERT INTO `teachers` (`id`, `email`, `user`, `password`, `name`) VALUES ('19', 'murphy.brock@example.com', 'pmosciski', '7d04affd2be482206462', 'Elvie Blick I');
INSERT INTO `teachers` (`id`, `email`, `user`, `password`, `name`) VALUES ('20', 'ffarrell@example.net', 'fleuschke', '589d72b6baf84c07d3b4', 'Dr. Mireya Mraz Jr.');


#
# TABLE STRUCTURE FOR: courses
#

DROP TABLE IF EXISTS `courses`;


CREATE TABLE `courses` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `teacher_id` bigint(20) NOT NULL,
  `startDate` date DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  PRIMARY KEY (`id`,`teacher_id`),
  KEY `teachers_courses_fk` (`teacher_id`),
  CONSTRAINT `teachers_courses_fk` FOREIGN KEY (`teacher_id`) REFERENCES `teachers` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `courses` (`id`, `name`, `teacher_id`, `startDate`, `endDate`) VALUES ('1', 'SD', '9', '1995-07-16', '1980-09-08');
INSERT INTO `courses` (`id`, `name`, `teacher_id`, `startDate`, `endDate`) VALUES ('2', 'ASDN', '19', '1996-05-25', '2001-09-21');
INSERT INTO `courses` (`id`, `name`, `teacher_id`, `startDate`, `endDate`) VALUES ('3', 'FLT', '2', '1971-06-16', '2009-09-04');
INSERT INTO `courses` (`id`, `name`, `teacher_id`, `startDate`, `endDate`) VALUES ('4', 'FP', '18', '1978-10-07', '1999-03-16');
INSERT INTO `courses` (`id`, `name`, `teacher_id`, `startDate`, `endDate`) VALUES ('5', 'IAI', '13', '2013-10-26', '1999-04-24');
INSERT INTO `courses` (`id`, `name`, `teacher_id`, `startDate`, `endDate`) VALUES ('6', 'ECG', '5', '1993-05-08', '2002-10-08');
INSERT INTO `courses` (`id`, `name`, `teacher_id`, `startDate`, `endDate`) VALUES ('7', 'GPS', '1', '2016-12-28', '2000-11-23');
INSERT INTO `courses` (`id`, `name`, `teacher_id`, `startDate`, `endDate`) VALUES ('8', 'LP', '6', '1973-11-20', '1990-05-02');
INSERT INTO `courses` (`id`, `name`, `teacher_id`, `startDate`, `endDate`) VALUES ('9', 'MA', '5', '1997-12-30', '1978-12-13');
INSERT INTO `courses` (`id`, `name`, `teacher_id`, `startDate`, `endDate`) VALUES ('10', 'LA', '16', '1982-07-18', '1979-01-10');
INSERT INTO `courses` (`id`, `name`, `teacher_id`, `startDate`, `endDate`) VALUES ('11', 'SM', '8', '1988-01-19', '2013-09-12');
INSERT INTO `courses` (`id`, `name`, `teacher_id`, `startDate`, `endDate`) VALUES ('12', 'CP', '17', '1991-12-10', '1997-11-04');
INSERT INTO `courses` (`id`, `name`, `teacher_id`, `startDate`, `endDate`) VALUES ('13', 'IP', '20', '1998-02-24', '1978-10-30');
INSERT INTO `courses` (`id`, `name`, `teacher_id`, `startDate`, `endDate`) VALUES ('14', 'DSD', '20', '2009-07-04', '1981-04-23');
INSERT INTO `courses` (`id`, `name`, `teacher_id`, `startDate`, `endDate`) VALUES ('15', 'FEC', '4', '1971-02-17', '1990-12-11');
INSERT INTO `courses` (`id`, `name`, `teacher_id`, `startDate`, `endDate`) VALUES ('16', 'ADC', '4', '2014-12-23', '2016-12-03');
INSERT INTO `courses` (`id`, `name`, `teacher_id`, `startDate`, `endDate`) VALUES ('17', 'OOP','13', '1972-01-23', '1986-10-05');
INSERT INTO `courses` (`id`, `name`, `teacher_id`, `startDate`, `endDate`) VALUES ('18', 'SMM', '9', '1994-03-09', '1976-05-24');
INSERT INTO `courses` (`id`, `name`, `teacher_id`, `startDate`, `endDate`) VALUES ('19', 'NC', '17', '1985-04-30', '2015-11-14');
INSERT INTO `courses` (`id`, `name`, `teacher_id`, `startDate`, `endDate`) VALUES ('20', 'PT', '10', '2003-12-22', '1995-10-07');


#
# TABLE STRUCTURE FOR: enrollments
#

DROP TABLE IF EXISTS `enrollments`;

CREATE TABLE `enrollments` (
  `course_id` bigint(20) NOT NULL,
  `student_id` bigint(20) NOT NULL,
  `status` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `grade` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`course_id`,`student_id`),
  KEY `students_enrollments_fk` (`student_id`),
  CONSTRAINT `courses_enrollments_fk` FOREIGN KEY (`course_id`) REFERENCES `courses` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `students_enrollments_fk` FOREIGN KEY (`student_id`) REFERENCES `students` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `enrollments` (`course_id`, `student_id`, `status`, `grade`) VALUES ('1', '15', 'Eaque earum maxime v', '3');
INSERT INTO `enrollments` (`course_id`, `student_id`, `status`, `grade`) VALUES ('2', '10', 'Animi qui dolorem qu', '4');
INSERT INTO `enrollments` (`course_id`, `student_id`, `status`, `grade`) VALUES ('3', '7', 'Enim quos dicta modi', '2');
INSERT INTO `enrollments` (`course_id`, `student_id`, `status`, `grade`) VALUES ('4', '15', 'Temporibus similique', '5');
INSERT INTO `enrollments` (`course_id`, `student_id`, `status`, `grade`) VALUES ('6', '19', 'Fugit et ipsa optio ', '9');
INSERT INTO `enrollments` (`course_id`, `student_id`, `status`, `grade`) VALUES ('9', '3', 'Laboriosam accusamus', '6');
INSERT INTO `enrollments` (`course_id`, `student_id`, `status`, `grade`) VALUES ('9', '7', 'Sequi consequatur di', '2');
INSERT INTO `enrollments` (`course_id`, `student_id`, `status`, `grade`) VALUES ('10', '5', 'Suscipit similique u', '3');
INSERT INTO `enrollments` (`course_id`, `student_id`, `status`, `grade`) VALUES ('13', '6', 'Incidunt sit enim id', '9');
INSERT INTO `enrollments` (`course_id`, `student_id`, `status`, `grade`) VALUES ('13', '11', 'Sit ipsum voluptatem', '8');
INSERT INTO `enrollments` (`course_id`, `student_id`, `status`, `grade`) VALUES ('13', '20', 'Et inventore dolores', '4');
INSERT INTO `enrollments` (`course_id`, `student_id`, `status`, `grade`) VALUES ('14', '10', 'Vero aut ipsam ipsum', '7');
INSERT INTO `enrollments` (`course_id`, `student_id`, `status`, `grade`) VALUES ('16', '20', 'Eius distinctio quo ', '3');
INSERT INTO `enrollments` (`course_id`, `student_id`, `status`, `grade`) VALUES ('17', '5', 'Nostrum recusandae f', '8');
INSERT INTO `enrollments` (`course_id`, `student_id`, `status`, `grade`) VALUES ('17', '8', 'Alias ut sit maxime ', '6');
INSERT INTO `enrollments` (`course_id`, `student_id`, `status`, `grade`) VALUES ('17', '11', 'Alias eligendi sint ', '1');
INSERT INTO `enrollments` (`course_id`, `student_id`, `status`, `grade`) VALUES ('18', '10', 'Voluptas id sapiente', '3');
INSERT INTO `enrollments` (`course_id`, `student_id`, `status`, `grade`) VALUES ('18', '16', 'Qui voluptatum nam e', '5');
INSERT INTO `enrollments` (`course_id`, `student_id`, `status`, `grade`) VALUES ('18', '18', 'Rem occaecati perspi', '6');
INSERT INTO `enrollments` (`course_id`, `student_id`, `status`, `grade`) VALUES ('20', '6', 'Id suscipit deserunt', '3');


#
# TABLE STRUCTURE FOR: exams
#

DROP TABLE IF EXISTS `exams`;

CREATE TABLE `exams` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `course_id` bigint(20) NOT NULL,
  `room` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`,`course_id`),
  KEY `courses_exams_fk` (`course_id`),
  CONSTRAINT `courses_exams_fk` FOREIGN KEY (`course_id`) REFERENCES `courses` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `exams` (`id`, `course_id`, `room`, `date`) VALUES ('1', '16', '204', '1984-06-03');
INSERT INTO `exams` (`id`, `course_id`, `room`, `date`) VALUES ('2', '19', '275', '1985-08-12');
INSERT INTO `exams` (`id`, `course_id`, `room`, `date`) VALUES ('3', '7', '262', '2014-05-12');
INSERT INTO `exams` (`id`, `course_id`, `room`, `date`) VALUES ('4', '11', '344', '1978-12-23');
INSERT INTO `exams` (`id`, `course_id`, `room`, `date`) VALUES ('5', '10', '345', '1976-05-11');
INSERT INTO `exams` (`id`, `course_id`, `room`, `date`) VALUES ('6', '19', '351', '1999-10-29');
INSERT INTO `exams` (`id`, `course_id`, `room`, `date`) VALUES ('7', '8', '288', '2004-08-27');
INSERT INTO `exams` (`id`, `course_id`, `room`, `date`) VALUES ('8', '4', '331', '1970-07-01');
INSERT INTO `exams` (`id`, `course_id`, `room`, `date`) VALUES ('9', '2', '192', '2006-10-06');
INSERT INTO `exams` (`id`, `course_id`, `room`, `date`) VALUES ('10', '14', '185', '1972-11-17');
INSERT INTO `exams` (`id`, `course_id`, `room`, `date`) VALUES ('11', '6', '176', '1975-09-14');
INSERT INTO `exams` (`id`, `course_id`, `room`, `date`) VALUES ('12', '6', '225', '2003-09-14');
INSERT INTO `exams` (`id`, `course_id`, `room`, `date`) VALUES ('13', '16', '101', '1994-05-29');
INSERT INTO `exams` (`id`, `course_id`, `room`, `date`) VALUES ('14', '13', '455', '1997-03-20');
INSERT INTO `exams` (`id`, `course_id`, `room`, `date`) VALUES ('15', '8', '330', '2007-09-13');
INSERT INTO `exams` (`id`, `course_id`, `room`, `date`) VALUES ('16', '7', '387', '2008-08-21');
INSERT INTO `exams` (`id`, `course_id`, `room`, `date`) VALUES ('17', '4', '449', '1980-02-27');
INSERT INTO `exams` (`id`, `course_id`, `room`, `date`) VALUES ('18', '2', '149', '1994-10-18');
INSERT INTO `exams` (`id`, `course_id`, `room`, `date`) VALUES ('19', '17', '224', '1971-12-28');
INSERT INTO `exams` (`id`, `course_id`, `room`, `date`) VALUES ('20', '17', '265', '2014-08-25');


#
# TABLE STRUCTURE FOR: registrations
#

DROP TABLE IF EXISTS `registrations`;

CREATE TABLE `registrations` (
  `exam_id` bigint(20) NOT NULL,
  `student_id` bigint(20) NOT NULL,
  PRIMARY KEY (`exam_id`,`student_id`),
  KEY `students_registrations_fk` (`student_id`),
  CONSTRAINT `exams_registrations_fk` FOREIGN KEY (`exam_id`) REFERENCES `exams` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `students_registrations_fk` FOREIGN KEY (`student_id`) REFERENCES `students` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

