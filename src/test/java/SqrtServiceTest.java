import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import ru.netology.sqr.homework.packages.and.cycles.SqrtService;

public class SqrtServiceTest {

    @ParameterizedTest

    public void shouldCalculateNumberOfRoots(int expected, int min, int max) {
        SqrtService service = new SqrtService();
        int actual = service.sqrCalc(min, max);

        Assertions.assertEquals(expected, actual);

    }
}
