-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-05-2022 a las 07:44:35
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 7.3.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `openbill`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `IDCL` int(11) NOT NULL,
  `CLNombre` varchar(45) NOT NULL,
  `CLMail` varchar(45) NOT NULL,
  `CLTelefono` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`IDCL`, `CLNombre`, `CLMail`, `CLTelefono`) VALUES
(1, 'Mi almacen', 'almacen@gmail.com', '4445721045'),
(2, 'el mayor', 'mayor@gmail.com', '444726745');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturas`
--

CREATE TABLE `facturas` (
  `IDF` int(11) NOT NULL,
  `NoFactura` int(11) NOT NULL,
  `FFechaHora` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `facturas`
--

INSERT INTO `facturas` (`IDF`, `NoFactura`, `FFechaHora`) VALUES
(1, 1001, ''),
(2, 1002, '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `IDPR` int(11) NOT NULL,
  `PRNombre` varchar(45) NOT NULL,
  `PRPrecio` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`IDPR`, `PRNombre`, `PRPrecio`) VALUES
(1, 'producto1', 10),
(2, 'producto2', 20),
(3, 'producto3', 30),
(4, 'producto4', 45),
(5, 'producto5', 55),
(6, 'producto6', 60);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedores`
--

CREATE TABLE `proveedores` (
  `IDPV` int(11) NOT NULL,
  `PVNombre` varchar(45) NOT NULL,
  `PVMail` varchar(45) NOT NULL,
  `PVTelefono` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `proveedores`
--

INSERT INTO `proveedores` (`IDPV`, `PVNombre`, `PVMail`, `PVTelefono`) VALUES
(1, 'proveedor1', 'proveedor1', '4445271826'),
(2, 'proveedor2', 'proveedor2@gmail.com', '4442635463');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor_producto`
--

CREATE TABLE `proveedor_producto` (
  `IDPPProveedor` int(11) NOT NULL,
  `IDPPProducto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `proveedor_producto`
--

INSERT INTO `proveedor_producto` (`IDPPProveedor`, `IDPPProducto`) VALUES
(1, 1),
(1, 2),
(1, 3),
(1, 4),
(2, 1),
(2, 2),
(2, 3),
(2, 4),
(2, 5),
(2, 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `IDU` int(11) NOT NULL,
  `UNombre` varchar(45) NOT NULL,
  `Usuario` varchar(20) NOT NULL,
  `UClave` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`IDU`, `UNombre`, `Usuario`, `UClave`) VALUES
(1, 'Zul', 'Zul', '1234'),
(2, 'Usuario2', 'Elchoco', 'chocoman');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario_cliente`
--

CREATE TABLE `usuario_cliente` (
  `IDUCUsuario` int(11) NOT NULL,
  `IDUCCliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario_cliente`
--

INSERT INTO `usuario_cliente` (`IDUCUsuario`, `IDUCCliente`) VALUES
(1, 1),
(1, 2),
(2, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario_proveedor`
--

CREATE TABLE `usuario_proveedor` (
  `IDUPUsuario` int(11) NOT NULL,
  `IDUPProveedor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario_proveedor`
--

INSERT INTO `usuario_proveedor` (`IDUPUsuario`, `IDUPProveedor`) VALUES
(1, 1),
(1, 2),
(2, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `IDV` int(11) NOT NULL,
  `IDVUsuario` int(11) NOT NULL,
  `IDVCliente` int(11) NOT NULL,
  `IDVProducto` int(11) NOT NULL,
  `VCantidad` int(11) NOT NULL,
  `IDVFactura` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`IDV`, `IDVUsuario`, `IDVCliente`, `IDVProducto`, `VCantidad`, `IDVFactura`) VALUES
(1, 1, 1, 1, 10, 1),
(2, 1, 1, 2, 5, 1),
(5, 1, 1, 3, 2, 1),
(6, 1, 2, 6, 2, 2),
(7, 1, 2, 5, 5, 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`IDCL`);

--
-- Indices de la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD PRIMARY KEY (`IDF`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`IDPR`);

--
-- Indices de la tabla `proveedores`
--
ALTER TABLE `proveedores`
  ADD PRIMARY KEY (`IDPV`);

--
-- Indices de la tabla `proveedor_producto`
--
ALTER TABLE `proveedor_producto`
  ADD PRIMARY KEY (`IDPPProveedor`,`IDPPProducto`),
  ADD KEY `IDProducto` (`IDPPProducto`),
  ADD KEY `IDProveedor` (`IDPPProveedor`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`IDU`);

--
-- Indices de la tabla `usuario_cliente`
--
ALTER TABLE `usuario_cliente`
  ADD PRIMARY KEY (`IDUCUsuario`,`IDUCCliente`),
  ADD KEY `IDCliente` (`IDUCCliente`),
  ADD KEY `IDUsuario` (`IDUCUsuario`);

--
-- Indices de la tabla `usuario_proveedor`
--
ALTER TABLE `usuario_proveedor`
  ADD PRIMARY KEY (`IDUPUsuario`,`IDUPProveedor`),
  ADD KEY `IDProveedor` (`IDUPProveedor`),
  ADD KEY `IDUsuario` (`IDUPUsuario`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`IDV`),
  ADD KEY `IDUsuario` (`IDVUsuario`),
  ADD KEY `IDCliente` (`IDVCliente`),
  ADD KEY `IDProducto` (`IDVProducto`),
  ADD KEY `IDFactura` (`IDVFactura`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `IDCL` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `facturas`
--
ALTER TABLE `facturas`
  MODIFY `IDF` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `IDPR` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `proveedores`
--
ALTER TABLE `proveedores`
  MODIFY `IDPV` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `IDU` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `IDV` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `proveedor_producto`
--
ALTER TABLE `proveedor_producto`
  ADD CONSTRAINT `proveedor_producto_ibfk_1` FOREIGN KEY (`IDPPProveedor`) REFERENCES `proveedores` (`IDPV`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `proveedor_producto_ibfk_2` FOREIGN KEY (`IDPPProducto`) REFERENCES `productos` (`IDPR`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `usuario_cliente`
--
ALTER TABLE `usuario_cliente`
  ADD CONSTRAINT `usuario_cliente_ibfk_1` FOREIGN KEY (`IDUCUsuario`) REFERENCES `usuario` (`IDU`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `usuario_cliente_ibfk_2` FOREIGN KEY (`IDUCCliente`) REFERENCES `clientes` (`IDCL`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `usuario_proveedor`
--
ALTER TABLE `usuario_proveedor`
  ADD CONSTRAINT `usuario_proveedor_ibfk_1` FOREIGN KEY (`IDUPUsuario`) REFERENCES `usuario` (`IDU`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `usuario_proveedor_ibfk_2` FOREIGN KEY (`IDUPProveedor`) REFERENCES `proveedores` (`IDPV`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `ventas_ibfk_1` FOREIGN KEY (`IDVUsuario`) REFERENCES `usuario` (`IDU`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ventas_ibfk_2` FOREIGN KEY (`IDVCliente`) REFERENCES `clientes` (`IDCL`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ventas_ibfk_3` FOREIGN KEY (`IDVProducto`) REFERENCES `productos` (`IDPR`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ventas_ibfk_4` FOREIGN KEY (`IDVFactura`) REFERENCES `facturas` (`IDF`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
