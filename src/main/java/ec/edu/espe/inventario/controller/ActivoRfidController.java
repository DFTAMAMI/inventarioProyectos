package ec.edu.espe.inventario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.inventario.model.ActivoRfid;
import ec.edu.espe.inventario.services.ActivoRfidService;
import ec.edu.espe.inventario.services.ActivoService;

@CrossOrigin(origins = "*", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping({ "/activosRFID" })
public class ActivoRfidController {
    @Autowired
    ActivoRfidService service;

    @Autowired
    ActivoService service2;

    @GetMapping("/listarActivosRfids")
    public List<ActivoRfid> listarActivoRfids() {
        return service.listaActivoRfids();
    }

    @PostMapping("/registrarActivosRfid")
    public ActivoRfid registrarActivo(@RequestBody ActivoRfid activoRfid) {
        return service.agregarActivoRfid(activoRfid);
    }

    @PostMapping("/actualizarActivoRfid")
    public ActivoRfid actualizarActivoRfid(@RequestBody ActivoRfid activoRfid) {
        return service.editarActivoRfid(activoRfid);
    }

    @GetMapping("/obtenerActivoRfid")
    public ActivoRfid obteneActivoRfid(String codigoR) {
        return service.obtenerActivoRfidByCodigoR(codigoR);
    }
}
