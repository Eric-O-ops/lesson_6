public class Boss extends GameEntity {

    private Weapon weaponBoss;

    public Weapon getWeaponBoss() {
        return weaponBoss;
    }

    public void setWeaponBoss(Weapon weaponBoss) {
        this.weaponBoss = weaponBoss;
    }

    public String printInfo(Boss nameBoss){

        return "\nCharacteristics BOSS:\n" +  " Health: [" + nameBoss.getHealth() +
        "]\n Damage: [" + nameBoss.getDamage()  + "]\n Protect: [" + nameBoss.getProtect() +
                "]\n Name weapon: {" + nameBoss.getWeaponBoss().getNameWeapon() +"} and type: {" +
                nameBoss.getWeaponBoss().getTypeWeapon() + "}";
    }

}

