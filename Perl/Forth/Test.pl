my @names = qw /fred barney betty dinoWilma pebbles bam-bamm/;
my $result = &which_element_is("pebbles", @names);
print $result;

sub which_element_is
{
	my($what, @array) = @_;
	foreach(@array)
	{
		if($what eq $_)
		{
			return $_;
		}
		print "²ÎÊıÎª".$_."\n";
	}
	return -1;
}