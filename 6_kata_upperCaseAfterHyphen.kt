fun toCamelCase(str:String):String{
    var result = ""
    var count = 0
    for (i in str.indices) {
        if (str[i] == '-' || str[i] == '_') {
            count++
        } else {
            if (count == 0) {
                result += str[i]
            } else {
                result += str[i].uppercaseChar()
                count = 0
            }
        }
    }
    return result
}

//      assertEquals("theStealthWarrior", toCamelCase("the_stealth_warrior"))
//      assertEquals("TheStealthWarrior", toCamelCase("The-Stealth-Warrior"))
//      assertEquals("ABC", toCamelCase("A-B-C"))