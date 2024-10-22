import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegionTest {

    private Region region;
    private Ciudad ciudad1;
    private Ciudad ciudad2;

    @BeforeEach
    void setUp() {
        region = new Region("Región Centro");
        ciudad1 = new Ciudad("Ciudad 1", 1000);
        ciudad2 = new Ciudad("Ciudad 2", 2000);
    }

    @Test
    void testCrearCiudad() {
        region.crearCiudad(ciudad1);
        assertTrue(region.getCiudades().contains(ciudad1), "La ciudad debería haber sido agregada a la región");

        region.crearCiudad(ciudad2);
        assertTrue(region.getCiudades().contains(ciudad2), "La ciudad debería haber sido agregada a la región");
    }

    @Test
    void testEliminarCiudad() {
        region.crearCiudad(ciudad1);
        region.eliminarCiudad(ciudad1);
        assertFalse(region.getCiudades().contains(ciudad1), "La ciudad debería haber sido eliminada de la región");
    }

    @Test
    void testModificarCiudad() {
        region.crearCiudad(ciudad1);
        region.modificarCiudad("Ciudad 1", "Ciudad Nueva", 3000);

        assertEquals("Ciudad Nueva", ciudad1.getNombre(), "El nombre de la ciudad debería haber sido modificado");
        assertEquals(3000, ciudad1.getCodigoPostal(), "El código postal de la ciudad debería haber sido modificado");
    }





}
