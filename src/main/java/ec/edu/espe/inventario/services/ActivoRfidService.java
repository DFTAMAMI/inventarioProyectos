package ec.edu.espe.inventario.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import ec.edu.espe.inventario.model.ActivoRfid;

@Service
public interface ActivoRfidService {

    List<ActivoRfid> listaActivoRfids();

    List<ActivoRfid> obtenerActivosRfidByCustodio(String custodio);

    List<ActivoRfid> obtenerActivosRfidByUsuario(String usuario);

    ActivoRfid obtenerActivoRfid(int codigo);

    ActivoRfid obtenerActivoRfidByCodigoR(String codigoR);

    ActivoRfid agregarActivoRfid(ActivoRfid activoRfid);

    ActivoRfid editarActivoRfid(ActivoRfid activoRfid);

    String subirFile(MultipartFile file, ActivoRfid activoRfid);
}
