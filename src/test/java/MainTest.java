
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class MainTest {

    @Test
   public void shouldBeAsConifer_returnIglasty() {
        //given
        Tree tree = new Conifer();
        //when
        //then
        assertThat(tree.getBranch()).isEqualTo("iglasta");
        assertThat(tree.getLeaves()).isEqualTo("iglaste");
        assertThat(tree.getStump()).isEqualTo("iglasty");
    }

    @Test
    public void shouldBeAsConifer() {
        //given
        Tree tree = new Conifer();
        //when
        tree.grow();
        //then
        assertThat(tree.toString()).contains("Drzewo iglaste");
        assertThat(tree.toString()).doesNotContain("Drzewo liściaste");
    }


    @Test
    public void shouldBeAsDeciduou_returnLiściasty() {
        //given
        Tree tree = new Deciduou();
        //when
        //then
        assertThat(tree.getBranch()).isEqualTo("liściaste");
        assertThat(tree.getLeaves()).isEqualTo("liściaste");
        assertThat(tree.getStump()).isEqualTo("liściasty");
    }

    @Test
    public void shouldBeAsDeciduou() {
        //given
        Tree tree = new Deciduou();
        //when
        tree.grow();
        //then
        assertThat(tree.toString()).doesNotContain("Drzewo iglaste");
        assertThat(tree.toString()).contains("Drzewo liściaste");
    }

}