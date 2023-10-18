
public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр оружия
        Weapon bossWeapon = new Weapon();
        bossWeapon.setType(WeaponType.SKS);
        bossWeapon.setName("Doombringer");

        // Создаем экземпляр босса и задаем свойства
        Boss boss = new Boss();
        boss.setName("Evil Boss");
        boss.setHealth(1000);
        boss.setWeapon(bossWeapon);

        // Выводим информацию о боссе
        System.out.println("Boss Name: " + boss.getName());
        System.out.println("Boss Health: " + boss.getHealth());
        System.out.println("Boss Weapon Type: " + boss.getWeapon().getType());
        System.out.println("Boss Weapon Name: " + boss.getWeapon().getName());
    }
}