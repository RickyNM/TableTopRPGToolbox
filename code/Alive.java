/*
 *  Aliva.java
 *
 *  Author: Strider Jonak
 *  Version: 11.18.2017
 *
 *  Superclass for living creatures that will extend
 *  both Character and Monster classes.
 */

public class Alive {

  public String Name;
  public int    MaxHealth;
  public int    CurrentHealth;
  public int    ArmorClass;
  public int    MoveSpeed;
  public int    Experience;

  public ItemList[]   = new Item[];
  public SpellList[]  = new SpellAbility[];

  // CONSTRUCTOR
  public Alive(String N, int HP, int AC, int MS) {
    Name          = N;
    MaxHealth     = H;
    CurrentHealth = H;
    ArmorClass    = AC;
    MoveSpeed     = MS;
    Experience    = 0;
  }

  /*
   *  getName - return String of name
   */
   public String getName() {
     return Name;
   }

   public void setName(String _Name) {
     Name = _Name;
   }

   public int getMaxHealth() {
     return MaxHealth;
   }

   public void setHealthMax(int _MaxHealth) {
     MaxHealth = _MaxHealth;
   }

   public int getCurrentHealth() {
     return CurrentHealth;
   }

   public void setCurrentHealth(int _CurrentHeath) {
     CurrentHealth = _CurrentHealth;
   }

   public int getExperience() {
     return Experience;
   }

   public void setExperience(int _Experience) {
     Experience = _Experience;
   }

   public int getArmorClass() {
     return ArmorClass;
   }

   public void setArmorClass(int _ArmorClass) {
     ArmorClass = _ArmorClass;
   }

   public int getMoveSpeed() {
     return MoveSpeed;
   }

   public void setMoveSpeed(int _MoveSpeed) {
     MoveSpeed = _MoveSpeed;
   }

  /*
   *  toString()  - return a String representation of the Alive object
   */
  public String toString() {
    return  Name +"\n"+
            CurrentHealth +"/"+     MaxHealth +"HP\n"+
            ArmorClass    +"AC\t"+  MoveSpeed +" Speed\n"+
            Experience +"EXP";
  }
}
