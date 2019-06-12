val states = Map("AL" -> "Alabama", "AK" -> "Alaska", "AZ" -> "Arizona")

val az = states("AZ") // Arizona

// however a wrong input will create exception

// get returns an option

val az1 = states.get("AZ") // Some(Arizona)

val azNot = states.get("FOO") // None

