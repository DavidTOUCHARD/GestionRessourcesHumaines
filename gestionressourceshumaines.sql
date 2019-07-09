-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  mar. 09 juil. 2019 à 16:39
-- Version du serveur :  10.1.25-MariaDB
-- Version de PHP :  5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `gestionressourceshumaines`
--

-- --------------------------------------------------------

--
-- Structure de la table `demande_formation`
--

CREATE TABLE `demande_formation` (
  `id` int(10) NOT NULL,
  `theme` varchar(30) NOT NULL,
  `date_formation` varchar(20) NOT NULL,
  `duree` int(5) NOT NULL,
  `description` varchar(150) NOT NULL,
  `validation` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `formation`
--

CREATE TABLE `formation` (
  `id_formation` varchar(10) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `theme` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `formation`
--

INSERT INTO `formation` (`id_formation`, `nom`, `theme`) VALUES
('1', 'Savoir gerer une equipe', 'Management'),
('2', 'Apprendre a faire ses lacets', 'Vie quotidienne');

-- --------------------------------------------------------

--
-- Structure de la table `salarie`
--

CREATE TABLE `salarie` (
  `id` int(10) NOT NULL,
  `password` varchar(20) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `fonction` varchar(100) NOT NULL,
  `date_embauche` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `salarie`
--

INSERT INTO `salarie` (`id`, `password`, `nom`, `prenom`, `email`, `fonction`, `date_embauche`) VALUES
(1, 'test', 'TOUCHARD', 'David', 'test@test.com', 'salarie', '09/07/2019'),
(2, 'pwd', 'Pierre', 'Paul', 'pierre.paul@gmail.com', 'Manager', '01/01/2000');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `demande_formation`
--
ALTER TABLE `demande_formation`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `salarie`
--
ALTER TABLE `salarie`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `demande_formation`
--
ALTER TABLE `demande_formation`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `salarie`
--
ALTER TABLE `salarie`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
