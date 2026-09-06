@startuml
skinparam classAttributeIconSize 0

package Personas {
  class Persona {
    -edad: byte
    #nombre: String
    -deudasAPagar: double
    -power: IPower
    +getNombre(): String
    +getEdad(): byte
    +setEdad(edad: byte): void
    +reducirDeudaConIngreso(ingreso: double): void
    +cantar(): void
    +setPower(power: IPower): void
    +atacar(): void
  }
}

package Profesiones {
  class Abogado {
    -cantidadCasos: int
    -PRECIO_CASO: int {static, final}
    -IMP_VENTAS: double {static, final}
    -dinero: int
    -nombresAbogados: String[]
    +atender(cantidad: int): int
    +getDinero(): int
    +setNombreFalse(): void
    +reducirDeudaConIngreso(ingreso: double): void
    +defender(): void
  }

  class Artista {
    -propiedades: Vector<String>
    -dineroInvertido: double
    +comprarPropiedad(propiedad: String, monto: double): void
    +venderPropiedad(propiedad: String, monto: double): void
    +getDineroInvertido(): double
    +getCantidadPropiedades(): int
  }

  class Manager {
    -abogados: Vector<Abogado>
    -artistas: Vector<Artista>
    +contratarAbogado(abogado: Abogado): void
    +contratarArtista(artista: Artista): void
    +getCantidadArtistas(): int
    +getCantidadabogados(): int
    +despedir(persona: Persona): void
  }

  Abogado --|> Personas.Persona
  Artista --|> Personas.Persona
  Manager --|> Personas.Persona

  Manager "1" o--> "0..*" Abogado : contrata >
  Manager "1" o--> "0..*" Artista : contrata >
}

package Poderes {
  interface IPower {
    +dispararPoder(): void
  }

  class PoderTiraCorazones implements IPower
  class PoderTiraDinero implements IPower
  class PoderTiraEstrellas implements IPower
  class PoderTiraHielo implements IPower
  class PoderTiraRayos implements IPower

  PoderTiraCorazones ..|> IPower
  PoderTiraDinero ..|> IPower
  PoderTiraEstrellas ..|> IPower
  PoderTiraHielo ..|> IPower
  PoderTiraRayos ..|> IPower
}

Personas.Persona "1" o--> "0..1" Poderes.IPower : tiene >

@enduml