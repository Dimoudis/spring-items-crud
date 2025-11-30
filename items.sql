-- https://www.phpmyadmin.net/


CREATE TABLE `items` (
  `code` VARCHAR(100) NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `price` INT NOT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `items` (`code`, `name`, `price`) VALUES
('021', 'wallet', 120),
('K2T', 'TV', 490);
