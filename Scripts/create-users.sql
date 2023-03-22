DROP TABLE IF EXISTS `authorities`;
DROP TABLE IF EXISTS `users`;

CREATE TABLE `users`(
    `username` varchar(50) not null,
    `password` varchar(68) not null,
    `enabled` tinyint not null,
    
    PRIMARY KEY(`username`)
)   Engine=InnoDB DEFAULT CHARSET=latin1;

Insert into users values
('john','{bcrypt}$2a$12$hS3NDL2mPJZmWdxnYYf8FuWecbNFbxp8pf31fEIuuDXTg86Zly6Xq',1),
('mary','{bcrypt}$2a$12$TI8gtTTHAfttq.z4lG40XOV9N33FnlUqYFfAPPgp3OQ8kfilA.XyW',1),
('suzan','{bcrypt}$2a$12$m2ozJxD.Usg4P2IvZVgQdOoSwZ.8el6ahEt9stGxttSl0t0YOImES',1);


CREATE TABLE `authorities`(
    `username` varchar(50) not null,
    `authority` varchar(50) not null,
    
    Unique KEY `authorities_idx_1`(`username`,`authority`),
    constraint `authorities_ibfk_1`
    foreign key(`username`)
    references `users` (`username`)
)   Engine=InnoDB DEFAULT CHARSET=latin1;
insert into `authorities` values 
('john','ROLE_EMPLOYEE'),
('mary','ROLE_EMPLOYEE'),
('mary','ROLE_MANAGER'),
('suzan','ROLE_EMPLOYEE'),
('suzan','ROLE_MANAGER'),
('suzan','ROLE_ADMIN');
