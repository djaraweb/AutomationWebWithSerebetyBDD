#language: es
@DEMOBLAZE
Característica: Validacion de producto en BlazeDemo
  Como un usuario de testing
  Quiero validar la pagina demoblaze
  Para registrar un usuario y agregar un producto al carrito de compras

  Antecedentes:
    Dado Que Cargo la pagina de demoblaze.com

  Esquema del escenario: Accediendo al home blazedemo para registrar un usuario
    Cuando presiono el boton sign up
    Y ingreso el usuario "<userID>"
    Y ingreso el password "<password>"
    Y Presiono el boton Sign Up
    Y presiono el boton de la Alerta
    Ejemplos:
      | userID    | password |
      | netadmin110 | 123456   |

  Esquema del escenario: Loguearse con usuario creado
    Cuando presiono el boton log in
    Y ingreso el usuario de login "<userID>"
    Y ingreso el password de login "<password>"
    Y Presiono el boton Log In
    Entonces Valido que el usuario este logueado
    Ejemplos:
      | userID    | password |
      | netadmin1 | 123456   |

  Esquema del escenario: Cerrar la session de un usuario logueado previamente
    Cuando presiono el boton log in
    Y ingreso el usuario de login "<userID>"
    Y ingreso el password de login "<password>"
    Y Presiono el boton Log In
    Entonces Valido que el usuario este logueado
    Y presiono el boton log out
    Entonces Valido que la session haya sido cerrada
    Ejemplos:
      | userID    | password |
      | netadmin1 | 123456   |

  Escenario: Agregar un laptop al carrito de compras
    Cuando presiono el link de categorias laptops
    Y presiono el link del producto Sony vaio i5
    Entonces valido que se muestre la pagina detalle del producto
    Y presiono el boton add to cart del producto
    Y presiono en link cart del menu
    Entonces valido que el producto este agregado en el carrito
