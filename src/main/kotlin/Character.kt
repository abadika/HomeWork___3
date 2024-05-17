sealed class Character(
    val name: String,
    val weaponType: WeaponType
) {
    data class Warrior(val ability: String) : Character(WarriorName, WeaponType.SWORD)
    data class Mage(val spell: String) : Character(MageName, WeaponType.STICK)
    data class Archer(val ability: String) : Character(ArcherName, WeaponType.BOW)

    companion object {
        const val WarriorName = "Воин"
        const val MageName = "Маг"
        const val ArcherName = "Лучник"
    }
}