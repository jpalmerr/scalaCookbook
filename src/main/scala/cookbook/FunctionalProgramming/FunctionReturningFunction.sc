def greeting(language: String) = (name: String) => {
  language match {
    case "english" => "Hello " + name
    case "spanish" => "Buenos  dias, " + name
  }
}
val hello = greeting("english")
hello("James") // Hello James