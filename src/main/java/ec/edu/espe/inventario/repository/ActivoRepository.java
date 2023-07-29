package ec.edu.espe.inventario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ec.edu.espe.inventario.model.ActivoRfid;

public interface ActivoRepository extends JpaRepository<ActivoRfid, Integer> {
        @Query(nativeQuery = true, value = "INSERT INTO ACTIVOSRFID (CODIGO_RFID,)"
                        + "CUSTODIO1, CUSTODIO2, DESCRIPCION) VALUES (:A, :B, :C, :D, :E, :F, :G)")
        ActivoRfid save(@Param("A") String codigoR, @Param("B") String custodio1,
                        @Param("C") String custodio2, @Param("D") String descripcion,
                        @Param("E") String usuario, @Param("F") String estadoJustificado,
                        @Param("G") String estadoTransaccion);

        List<ActivoRfid> findAll();

        @Query(nativeQuery = true, value = "SELECT * FROM ACTIVOSRFID a WHERE a.CODIGO_RFID = :C")
        ActivoRfid obtenerActivosRfidByCustodioR(@Param("C") String custodioR);

        @Query(nativeQuery = true, value = "SELECT * FROM ACTIVOSRFID a WHERE a.CUSTODIO1 = :C")
        List<ActivoRfid> obtenerActivosRfidByCustodio(@Param("C") String custodio1);

        @Query(nativeQuery = true, value = "SELECT * FROM ACTIVOSRFID a WHERE a.CODIGO = :C")
        ActivoRfid obtenerActivosRfidByCodigo(@Param("C") String custodioR);

        @Query(nativeQuery = true, value = "SELECT * FROM ACTIVOSRFID a WHERE a.CUSTODIO1 = :C")
        List<ActivoRfid> obtenerActivosRfidByUsuario(@Param("C") String usuario);

}
