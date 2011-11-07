require 'lib.luaspec'
require 'src.calculadora'

describe["Calculadora Romana"] = function()
  it["I + I deve ser II"] = function()
  	expect( soma_romana( "I", "I") ).should_be(2)
  end
  it["I + II deve ser III"] = function()
    expect( soma_romana( "I", "II")).should_be(3)
  end
end

spec:report(false)


