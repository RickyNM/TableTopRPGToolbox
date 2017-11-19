public class Alive {

  public String name;
  public int healthMax;
  public int healthNow;
  public int experience;
  public int armorClass;
  public int moveSpeed;

  public inventory[] = new Item[];
  public spellList[] = new SpellAbility[];

  // CONSTRUCTOR
  public Alive(String name, int HP, int AC, int MS) {
    healthMax   = HP;
    healthNow   = HP;
    experience  = 0;
    armorClass  = AC;
    moveSpeed   = MS;
  }

  /*
   *  getName - return String of name
   */
   public String getName() {
     return name;
   }

   public void setName(String rename) {
     name = rename;
   }

   public int getHealthMax() {
     return healthMax;
   }

   public void setHealthMax(int health) {
     healthMax = health;
   }

   public int getHealthNow() {
     return healthNow;
   }

   public void setHealthNow(int health) {
     healthNow = health;
   }

   public int getExperience() {
     return healthNow;
   }

   public void setExperience(int exp) {
     experience = exp;
   }

   public int getArmorClass() {
     return armorClass;
   }

   public void setArmorClass(int AC) {
     armorClass = AC;
   }

   public int getMoveSpeed() {
     return moveSpeed;
   }

   public void setMoveSpeed(int MS) {
     moveSpeed = MS;
   }

  /*
   *  toString()  - return a String representation of the Alive object
   */
  public String toString() {
    return name + "\tHealth: " + healthNow + "/" + healthMax + "\n"
                + armorClass + "AC\t" + moveSpeed + " Speed\n"
                + experience + "EXP";
  }
}
