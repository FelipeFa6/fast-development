
--      DDL
-- Base de datos: `bdfastdevelopment10`
--

CREATE DATABASE BDFASTDEVELOPMENT;

USE BDFASTDEVELOPMENT

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `arriendo`
--

CREATE TABLE `arriendo` (
  `ID` int(11) NOT NULL,
  `COSTO_ARRIENDO` int(11) NOT NULL,
  `FECHA_ARRIENDO` date NOT NULL,
  `DIAS_ARRENDADOS` int(11) NOT NULL,
  `FECHA_ENTREGA` date NOT NULL,
  `FK_RUT_CLIENTE` varchar(50) DEFAULT NULL,
  `FK_RUT_TRABAJADOR` varchar(50) DEFAULT NULL,
  `FK_NUMERO_SERIE` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `RUT_CLIENTE` varchar(50) NOT NULL,
  `NOMBRE` varchar(50) NOT NULL,
  `APELLIDO_PATERNO` varchar(50) NOT NULL,
  `APELLIDO_MATERNO` varchar(50) NOT NULL,
  `DIRECCION` varchar(50) NOT NULL,
  `TELEFONO` varchar(50) NOT NULL,
  `CORREO` varchar(50) NOT NULL,
  `FECHA_NACIMIENTO` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`RUT_CLIENTE`, `NOMBRE`, `APELLIDO_PATERNO`, `APELLIDO_MATERNO`, `DIRECCION`, `TELEFONO`, `CORREO`, `FECHA_NACIMIENTO`) VALUES
('20330184-7', 'mauricio', 'paredes', 'paredes', 'colina 3', '974685534', 'mauricio.paredes@gmail.com', '2011-10-18');



-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `distribuidor`
--

CREATE TABLE `distribuidor` (
  `RUT_DISTRIBUIDOR` varchar(50) NOT NULL,
  `NOMBRE` varchar(50) NOT NULL,
  `DIRECCION` varchar(50) NOT NULL,
  `TELEFONO` varchar(50) NOT NULL,
  `FK_NUMERO_SERIE` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `isbn`
--

CREATE TABLE `isbn` (
  `ISBN` varchar(50) NOT NULL,
  `CATEGORIA` varchar(50) NOT NULL,
  `IDIOMA` varchar(50) NOT NULL,
  `AUTOR` varchar(50) NOT NULL,
  `EDITORIAL` varchar(50) NOT NULL,
  `TITULO` varchar(50) NOT NULL,
  `NUMERO_PAGINA` int(11) NOT NULL,
  `FECHA_PUBLICACION` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `isbn`
--

INSERT INTO `isbn` (`ISBN`, `CATEGORIA`, `IDIOMA`, `AUTOR`, `EDITORIAL`, `TITULO`, `NUMERO_PAGINA`, `FECHA_PUBLICACION`) VALUES
('1234567891', 'Comedia', 'Italiano', 'si', 'Zig-Zag', 'simonquijote', 450, '2000-07-03');


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libro`
--

CREATE TABLE `libro` (
  `NUMERO_SERIE` int(11) NOT NULL,
  `PRECIO` int(11) NOT NULL,
  `PRECIO_IVA` int(11) NOT NULL,
  `DISTRIBUIDOR` varchar(50) NOT NULL,
  `ISBN_FK` varchar(50) DEFAULT NULL,
  `ESTADO` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `libro`
--

INSERT INTO `libro` (`NUMERO_SERIE`, `PRECIO`, `PRECIO_IVA`, `DISTRIBUIDOR`, `ISBN_FK`, `ESTADO`) VALUES
(152365484, 51402, 9766, 'Distribuidora de Material Didactico', '1234567891', 'Disponible');


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trabajador`
--

CREATE TABLE `trabajador` (
  `RUT_TRABAJADOR` varchar(50) NOT NULL,
  `NOMBRE` varchar(50) NOT NULL,
  `APELLIDO_PATERNO` varchar(50) NOT NULL,
  `APELLIDO_MATERNO` varchar(50) NOT NULL,
  `DIRECCION` varchar(50) NOT NULL,
  `TELEFONO` varchar(50) NOT NULL,
  `CORREO` varchar(50) NOT NULL,
  `FECHA_CONTRATO` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `trabajador`
--

INSERT INTO `trabajador` (`RUT_TRABAJADOR`, `NOMBRE`, `APELLIDO_PATERNO`, `APELLIDO_MATERNO`, `DIRECCION`, `TELEFONO`, `CORREO`, `FECHA_CONTRATO`) VALUES
('1565165-4', 'sisisis', 'sisisi', 'sisisiis', 'sisi123', '+56123456721', 'osakdo@skso.cl', '2020-04-06');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `ID` int(11) NOT NULL,
  `FECHA_VENTA` date NOT NULL,
  `FK1_NUMERO_SERIE` int(11) DEFAULT NULL,
  `FK1_RUT_CLIENTE` varchar(50) DEFAULT NULL,
  `FK1_RUT_TRABAJADOR` varchar(50) DEFAULT NULL,
  `METODO_PAGO` varchar(50) NOT NULL,
  `TIPO_VENTA` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `arriendo`
--
ALTER TABLE `arriendo`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FKC1` (`FK_RUT_CLIENTE`),
  ADD KEY `FKT1` (`FK_RUT_TRABAJADOR`),
  ADD KEY `FKL1` (`FK_NUMERO_SERIE`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`RUT_CLIENTE`),
  ADD UNIQUE KEY `TELEFONO` (`TELEFONO`),
  ADD UNIQUE KEY `CORREO` (`CORREO`);

--
-- Indices de la tabla `distribuidor`
--
ALTER TABLE `distribuidor`
  ADD PRIMARY KEY (`RUT_DISTRIBUIDOR`),
  ADD KEY `FKL5` (`FK_NUMERO_SERIE`);

--
-- Indices de la tabla `isbn`
--
ALTER TABLE `isbn`
  ADD PRIMARY KEY (`ISBN`);

--
-- Indices de la tabla `libro`
--
ALTER TABLE `libro`
  ADD PRIMARY KEY (`NUMERO_SERIE`),
  ADD KEY `FKI` (`ISBN_FK`);

--
-- Indices de la tabla `trabajador`
--
ALTER TABLE `trabajador`
  ADD PRIMARY KEY (`RUT_TRABAJADOR`),
  ADD UNIQUE KEY `TELEFONO` (`TELEFONO`),
  ADD UNIQUE KEY `CORREO` (`CORREO`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FKL` (`FK1_NUMERO_SERIE`),
  ADD KEY `FKC` (`FK1_RUT_CLIENTE`),
  ADD KEY `FKT` (`FK1_RUT_TRABAJADOR`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `arriendo`
--
ALTER TABLE `arriendo`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `arriendo`
--
ALTER TABLE `arriendo`
  ADD CONSTRAINT `FKC1` FOREIGN KEY (`FK_RUT_CLIENTE`) REFERENCES `cliente` (`RUT_CLIENTE`),
  ADD CONSTRAINT `FKL1` FOREIGN KEY (`FK_NUMERO_SERIE`) REFERENCES `libro` (`NUMERO_SERIE`),
  ADD CONSTRAINT `FKT1` FOREIGN KEY (`FK_RUT_TRABAJADOR`) REFERENCES `trabajador` (`RUT_TRABAJADOR`);

--
-- Filtros para la tabla `distribuidor`
--
ALTER TABLE `distribuidor`
  ADD CONSTRAINT `FKL5` FOREIGN KEY (`FK_NUMERO_SERIE`) REFERENCES `libro` (`NUMERO_SERIE`);

--
-- Filtros para la tabla `libro`
--
ALTER TABLE `libro`
  ADD CONSTRAINT `FKI` FOREIGN KEY (`ISBN_FK`) REFERENCES `isbn` (`ISBN`);

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `FKC` FOREIGN KEY (`FK1_RUT_CLIENTE`) REFERENCES `cliente` (`RUT_CLIENTE`),
  ADD CONSTRAINT `FKL` FOREIGN KEY (`FK1_NUMERO_SERIE`) REFERENCES `libro` (`NUMERO_SERIE`),
  ADD CONSTRAINT `FKT` FOREIGN KEY (`FK1_RUT_TRABAJADOR`) REFERENCES `trabajador` (`RUT_TRABAJADOR`);
COMMIT;