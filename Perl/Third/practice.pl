=lab1
print "enter the string please:\n";
@str = reverse <STDIN>;
print "\nthe reverse strings are:\n @str";
=cut

=lab2

$i = 0;
@name = qw /fred betty barney dino Wlma pedbbles bamm-bamm/;
print "enter the number please:\n";
chomp(@nums = <STDIN>);
foreach(@nums)
{
	@re = @name;
	while($i != $_)
	{
		print "i:",$i,"\n";
		print $_,"\n";
		$n = shift(@re);
		print "n:",$n,"\n";
		print "------------\n";
		$i++;
	}
	$i = 0;
	print $n,"\n";
}
=cut

=lab3
chomp(@str = sort<STDIN>);
foreach(@str)
{
	print $_,"\n";
}
=cut