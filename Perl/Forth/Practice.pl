=lab1
sub total
{
	foreach $n(0..$#_)
	{
		$sum += $_[$n];
		print "\$_ is".$_."\n";
		print "\$n is".$n."\n";
		print "\$_[\$n] is".$_[$n]."\n";
	}
	return $sum;
}

my $sum = 0;
my @fred = qw{1 3 5 7 9};
my $fred_total = &total(@fred);
print "The total of \@fred is $fred_total.\n";
print "Enter some numbers on separate lines:\n";
my $user_total = &total(<STDIN>);
print "The total of those numbers is $user_total.\n";
=cut

=lab2
sub total
{
	foreach $n(0..$#_)
	{
		$sum += $_[$n];
	}
	return $sum;
}
@num = {1..1000};
$sum = &total(@num);
print "The sum of 1..1000 is $sum\n";
=cut

sub average
{
	foreach $n(0..$#_)
	{
		$sum += $_[$n];  
	}
	$average = $sum / ($#_ + 1);
}

sub above_averge
{
	@num = @_;
	@aba = ();
	$av = &average(@num);
	foreach $n(0..$#_)
	{
		if($_[$n] > $av)
		{
			push (@aba.$_[$n]);
		}
	}
}
