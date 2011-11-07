 function soma_tabela(t)
    valor = 0
    for n = 1, #t do
        valor = valor + t[n]
    end
    return valor
  end
  
  function separa_string (s)
     
    local  t = {}
    for letra in string.gmatch(s, "%w") do
    table.insert(t,letra)
    end
    return t
  end
  
function soma_romana(num1,num2) 
    
    local valores = { I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000 }
  
    local num1separado = separa_string (num1)
    local valornum1 = soma_tabela(num1separado)
    
    local num2separado = separa_string (num2)
    local valornum2 = soma_tabela(num2separado)
    
    valornum1 = valores[num1]
    valornum2 = valores[num2]
    local soma = valornum1 + valornum2
      
  
  return soma
end

 
