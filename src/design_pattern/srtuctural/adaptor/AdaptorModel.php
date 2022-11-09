<?php



//echo strtotime("2002/12/12");
interface Card
{
    public function deposit(float $amount);
    public function withdraw(float $amount);
}

class Details //adapter
{
///if Details class latter removed , all we need to do
/// is to implement our interface for the new class
//and it method will be called within the implementd method
    private string $name;
    public function setName(string $name): void
    {
        $this->name   = $name;
    }

    public function getName(): string
    {
        return $this->name;
    }

    public function withdraw(float $amt): float|string
    {
        return $amt;
    }

    public function deposit(float $amt)
    {
        return $amt . " Deposited";
    }
}


class User/*adaptee*/ extends Details implements Card
{
    private float $total = 0;
    public function deposit(float $amt)
    {
        $this->total  += $amt;
        return $this->total;
    }
    public function getBalance(): float
    {
        return $this->total;
    }

    public function withdraw(float $amt): float|string
    {
        if ($amt > $this->total) return "insufficient funds";
        $this->total  = $this->total - $amt;
        return $amt;
    }
}
$u    = new User();
$u->deposit(234.353);
echo $u->withdraw(234.353) . "\n";

echo $u->getBalance() . "\n";
$u->deposit(20000) . "\n";
echo $u->getBalance() . "\n";
$u->deposit(15400);
echo $u->getBalance() . "\n";
echo $u->withdraw(30200) . "\n";

echo $u->getBalance() . "\n";
