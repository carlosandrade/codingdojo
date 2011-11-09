require 'lib.luaspec'
require 'src.calculadora'

describe["Calculadora Romana"] = function()
  it["I + I deve ser II"] = function()
  	expect( soma_romana( "I", "I") ).should_be(2)
  end
   it["V + V deve ser X"] = function()
    expect( soma_romana( "V", "V")).should_be(10)
  end
   it["X + X deve ser XX"] = function()
    expect( soma_romana( "X", "X")).should_be(20)
  end
  it["X + XX deve ser XXX"] = function()
    expect( soma_romana( "X", "XX")).should_be(30)
  end
end

describe["Soma tabela"] = function()
    it["{2,2} deve retornar 4"] = function()
    expect( soma_tabela( {2,2} )).should_be(4)
  end
end

describe["separaString"] = function()
    it["XX deve retornar {X,X}"] = function()
        local res1 = {"X","X"}
        local res2 = separa_string("XX")
        expect(res1[1]).should_be(res2[1])
        expect(res1[2]).should_be(res2[2])
    end
end

spec:report(false)


