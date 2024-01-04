-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : jeu. 04 jan. 2024 à 20:10
-- Version du serveur : 10.4.32-MariaDB
-- Version de PHP : 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `mysqlgl`
--

-- --------------------------------------------------------

--
-- Structure de la table `bank`
--

CREATE TABLE `bank` (
  `pin` varchar(10) DEFAULT NULL,
  `date` varchar(50) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL,
  `amount` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `clients`
--

CREATE TABLE `clients` (
  `id` int(11) NOT NULL,
  `type` varchar(20) NOT NULL,
  `nom` varchar(50) DEFAULT NULL,
  `prenom` varchar(50) DEFAULT NULL,
  `date_naissance` date DEFAULT NULL,
  `adresse` varchar(100) DEFAULT NULL,
  `profession` varchar(50) DEFAULT NULL,
  `employeur` varchar(50) DEFAULT NULL,
  `tuteur` varchar(50) DEFAULT NULL,
  `raison_sociale` varchar(100) DEFAULT NULL,
  `activite` varchar(100) DEFAULT NULL,
  `registre_commerce` varchar(50) DEFAULT NULL,
  `immatriculation_fiscale` varchar(50) DEFAULT NULL,
  `responsable` varchar(50) DEFAULT NULL,
  `pin` int(20) NOT NULL,
  `formno` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `comptes_bancaires`
--

CREATE TABLE `comptes_bancaires` (
  `numero_compte` varchar(20) NOT NULL,
  `date_ouverture` date DEFAULT NULL,
  `solde` decimal(10,2) DEFAULT NULL,
  `type_compte` varchar(20) NOT NULL,
  `autorisation_decouvert` tinyint(1) DEFAULT NULL,
  `montant_critique` decimal(10,2) DEFAULT NULL,
  `taux_interet` decimal(5,2) DEFAULT NULL,
  `pin` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `login`
--

CREATE TABLE `login` (
  `formno` varchar(20) DEFAULT NULL,
  `cardnumber` varchar(25) DEFAULT NULL,
  `pin` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `operations`
--

CREATE TABLE `operations` (
  `id` int(11) NOT NULL,
  `type_operation` varchar(10) NOT NULL,
  `montant` decimal(10,2) DEFAULT NULL,
  `date_operation` date DEFAULT NULL,
  `numero_compte` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `responsables_bancaires`
--

CREATE TABLE `responsables_bancaires` (
  `id` int(11) NOT NULL,
  `identifiant` varchar(50) DEFAULT NULL,
  `mot_de_passe` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `comptes_bancaires`
--
ALTER TABLE `comptes_bancaires`
  ADD PRIMARY KEY (`numero_compte`);

--
-- Index pour la table `operations`
--
ALTER TABLE `operations`
  ADD PRIMARY KEY (`id`),
  ADD KEY `numero_compte` (`numero_compte`);

--
-- Index pour la table `responsables_bancaires`
--
ALTER TABLE `responsables_bancaires`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `identifiant` (`identifiant`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `clients`
--
ALTER TABLE `clients`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `operations`
--
ALTER TABLE `operations`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `responsables_bancaires`
--
ALTER TABLE `responsables_bancaires`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `operations`
--
ALTER TABLE `operations`
  ADD CONSTRAINT `operations_ibfk_1` FOREIGN KEY (`numero_compte`) REFERENCES `comptes_bancaires` (`numero_compte`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
