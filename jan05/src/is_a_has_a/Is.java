package is_a_has_a;

public class Is {
public static void main(String[] args) {
	Police police = new Police();
	Gun gun = new Gun();
	police.gun=gun;
	police.gun.name = "총이름";
}
}
