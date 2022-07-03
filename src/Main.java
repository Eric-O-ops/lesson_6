public class Main {
    public static void main(String[] args) {

        Weapon ak_47 = new Weapon();
        ak_47.setTypeWeapon("ak-47");
        ak_47.setNameWeapon("Assault rifle");

        Weapon woodenBow = new Weapon();
        woodenBow.setTypeWeapon("wooden bow");
        woodenBow.setNameWeapon("skeleton's bow");


        Boss boss = new Boss();
        boss.setDamage(100);
        boss.setHealth(200);
        boss.setProtect("Immunity to fire");
        boss.setWeaponBoss(ak_47);

        Skeleton skeletonNumberOne = new Skeleton();
        skeletonNumberOne.setDamage(150);
        skeletonNumberOne.setHealth(100);
        skeletonNumberOne.setProtect("Immunity to magic");
        skeletonNumberOne.setWeaponBoss(woodenBow);



        Skeleton skeletonNumberTwo = new Skeleton();
        skeletonNumberTwo.setDamage(165);
        skeletonNumberTwo.setHealth(90);
        skeletonNumberTwo.setProtect("Immunity to magic");
        skeletonNumberTwo.setWeaponBoss(woodenBow);




        System.out.println(boss.printInfo(boss));
        System.out.println(skeletonNumberOne.printInfo(skeletonNumberOne));
        System.out.println(skeletonNumberTwo.printInfo(skeletonNumberTwo));

    }
}