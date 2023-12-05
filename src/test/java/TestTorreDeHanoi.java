import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTorreDeHanoi {

    @Test
    public void testResolverHanoi3Discos() {
        TorreDeHanoi torre = new TorreDeHanoi();
        assertEquals(7, torre.resolverHanoi(3));
    }

    @Test
    public void testResolverHanoi5Discos() {
        TorreDeHanoi torre = new TorreDeHanoi();
        assertEquals(31, torre.resolverHanoi(5));
    }

    // Adicione mais testes conforme necessário
}
