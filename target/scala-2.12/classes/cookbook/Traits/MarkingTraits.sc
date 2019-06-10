// you want to mark your trait so it can
// only be used by a given base type

trait StarfleetWarpCore {
  this: Starship =>
  //
}

class Starship
class Enterprise extends Starship with StarfleetWarpCore // compiles

class RomulanShip
// this won't compile...
// class Warbird extends RomulanShip with StarfleetWarpCore