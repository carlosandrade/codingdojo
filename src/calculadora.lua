function soma_romana(num1,num2) 
    
  local valores = { I = 1, V = 5, X = 10, L = 50, C = 100, D = 500 }
  local soma = valores[num1] + valores[num2]
  
  
  return soma
end
