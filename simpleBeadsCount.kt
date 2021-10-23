fun countRedBeads(nBlue: Int): Int {
    var returner: Int? = null //not able to use lateinit

    if(nBlue < 2){
        returner = 0
    } else if (nBlue >= 2){
        returner = 2 * nBlue - 2
    }
    return returner!! // not null
}

// OR ANOTHER ATTEMPT

fun countRedBeads(nBlue: Int): Int = when {
  nBlue < 2 -> 0
  else -> 2 * nBlue - 2
}

// use countRedBeads(3) (3 is for example, same as 1/5/7)
/* Two red beads are placed between every two blue beads. There are N blue beads. After looking at the arrangement below work out the number of red beads.

@ @@ @ @@ @ @@ @ @@ @ @@ @

Implement count_red_beads(n) (in PHP count_red_beads($n); in Java, Javascript, TypeScript, C, C++ countRedBeads(n)) so that it returns the number of red beads.
If there are less than 2 blue beads return 0.
*/

