import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DiamondTest {

    @Test
    public void should_find_A() {
        assertThat(new Diamond().create(1)).isEqualTo("A");
    }

    @Test
    public void should_2_find_B() {
        assertThat(new Diamond().create(2)).startsWith(".A.\nB");
    }

    @Test
    public void should_2_find_B_with_end_of_B() {
        assertThat(new Diamond().create(2)).startsWith(".A.\nB.B");
    }

    @Test
    public void all_round_B() {
        assertThat(new Diamond().create(2)).isEqualTo(".A.\nB.B\n.A.");
    }

    @Test
    public void all_round_C() {
        assertThat(new Diamond().create(3)).isEqualTo("..A..\n.B.B.\nC...C\n.B.B.\n..A..");
    }

    @Test
    public void all_round_D() {
        assertThat(new Diamond().create(4)).isEqualTo("...A...\n..B.B..\n.C...C.\nD.....D\n.C...C.\n..B.B..\n...A...");
    }

}
