object CharacterCommon {
    fun attack(character: Character) {
        with(character) {
            when (character) {
                is Character.Archer -> {
                    println("$name ${character.ability} приминил способность ${weaponType.type}")
                }

                is Character.Mage -> {
                    println("$name ${character.spell} применил заклинание ${weaponType.type}")
                }

                is Character.Warrior -> {
                    println("$name ${character.ability} применил способность ${weaponType.type}")
                }
            }
        }
    }

    fun defend(character: Character) {
        with(character) {
            when (character) {
                is Character.Archer -> {
                    println("$name ${character.ability} применив уклонение")
                }

                is Character.Mage -> {
                    println("$name ${character.spell} применил заклинание Защита тьмы")
                }

                is Character.Warrior -> {
                    println("$name ${character.ability} применил способность Защита архАнгела")
                }
            }
        }
    }
}