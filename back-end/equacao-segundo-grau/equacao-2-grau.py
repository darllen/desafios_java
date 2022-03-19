a = int(input('Digite o valor de A: '))

if (a != 0): 
  b = int(input('Digite o valor de B: '))
  c = int(input('Digite o valor de C: '))

  delta = (b ** 2) - (4 * a * c)

  if delta != 0 :
    if (delta < 0):
      print('Equação não possui raízes reais')
    
    elif (delta > 0): 
        x1 = (-b + (delta**0.5))/(2*a)
        x2 = (-b - (delta**0.5))/(2*a)

        #print('X1 = ' + x1\n 'X2 = ' + x2)
        print(f'X1 =  {x1}\nX2 =  {x2}')

    else: 
      x = (-b/(2*a))
      print (f'Com delta igual zero temos uma unica raíz que é {x}')
else: # a=0
  print('Não é equação do segundo grau')