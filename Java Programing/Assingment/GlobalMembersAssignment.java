public class GlobalMembersAssignment
{
	public static int pos = 0;
	public static info[] data = new info[100];
	public static int retPos(String str,int dd) //return the entry position
	{
		int i;
		if (dd == 1)
		{
		for (i = 1;i <= pos;i++)
		{
		  if (data[i].name.equals(str))
		  {
			  return i;
		  }
		}
		if (i > pos)
		{
			return 0;
		}
		}
		else
		{
			for (i = 1;i <= pos;i++)
			{
		  if (data[i].id.equals(str))
		  {
			  return i;
		  }
			}
		if (i > pos)
		{
			return 0;
		}
		}
	}

	public static void delet() // delete an entry by label name or symbol name
	{
		  System.out.print("delete by :");
		  System.out.print("\n");
		  System.out.print("     by label press  1: ");
		  System.out.print("\n");
		  System.out.print("     by symbol pres 2: ");
		  System.out.print("\n");
		  int chis;
		  chis = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  switch (chis)
		  {
		  case 1: /// delete entry by label name
		  {
				String dnm;
				System.out.print(" label : ");
				dnm = ConsoleInput.readToWhiteSpace(true);
				int retp = retPos(dnm, 1);
				for (int i = retp;i < pos;i++)
				{
					data[i].name = data[i + 1].name;
					data[i].id = data[i + 1].id;
					data[i].type = data[i + 1].type;
				}
				data[pos].name = "";
				data[pos].id = "";
				data[pos].type = "";
				pos--;
				break;
		  }
		  case 2: ///delete entry by symbol name
		  {
				String dnm;
				System.out.print(" symbol : ");
				dnm = ConsoleInput.readToWhiteSpace(true);
				int retp = retPos(dnm, 2);
				for (int i = retp;i < pos;i++)
				{
					data[i].name = data[i + 1].name;
					data[i].id = data[i + 1].id;
					data[i].type = data[i + 1].type;
				}
				data[pos].name = "";
				data[pos].id = "";
				data[pos].type = "";
				pos--;
				break;
		  }
		  }
	}
	public static void modify() /// modify entry in different aspects
	{
		System.out.print("modify  :");
		System.out.print("\n");
		  System.out.print("     for label press 1: ");
		  System.out.print("\n");
		  System.out.print("     for symbol pres 2: ");
		  System.out.print("\n");
		  System.out.print("     for all pres    3: ");
		  System.out.print("\n");
		  int chis;
		  chis = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  switch (chis)
		  {
		  case 1: /// modify the label of an entry
		  {
				String dnm;
				System.out.print(" old label : ");
				dnm = ConsoleInput.readToWhiteSpace(true);
				int retp = retPos(dnm, 1);
				String nm;
				String id;
				String typ;
						System.out.print("new label    : ");
						nm = ConsoleInput.readToWhiteSpace(true);
					   // cout<<"symbol   : ";
					   // cin>>id;
					   // cout<<" : ";
					   // cin>>typ;
						data[retp].name = nm;
					   // data[retp].id=id;
						//data[retp].type=typ;
				break;
		  }
		  case 2: /// modify symbol of  an entry
		  {
				String dnm;
				System.out.print(" old symbol : ");
				dnm = ConsoleInput.readToWhiteSpace(true);
				int retp = retPos(dnm, 2);
				String nm;
				String id;
				String typ;
						//cout<<"name : ";
						//cin>>nm;
						System.out.print("new symbol   : ");
						id = ConsoleInput.readToWhiteSpace(true);
					   // cout<<"type : ";
					   // cin>>typ;
					   // data[retp].name=nm;
						data[retp].id = id;
						//data[retp].type=typ;
				break;
		  }
		  case 3: /// modify all information of entry
		  {
				String dnm;
				System.out.print(" old label : ");
				dnm = ConsoleInput.readToWhiteSpace(true);
				int retp = retPos(dnm, 1);
				String nm;
				String id;
				String typ;
						System.out.print("new label    : ");
						nm = ConsoleInput.readToWhiteSpace(true);
						System.out.print("new symbol   : ");
						id = ConsoleInput.readToWhiteSpace(true);
						System.out.print("new address  : ");
						typ = ConsoleInput.readToWhiteSpace(true);
						data[retp].name = nm;
						data[retp].id = id;
						data[retp].type = typ;
				break;


		  }

		  }

	}
	public static void sarch() /// search an entry by label or symbol
	{
		  System.out.print("search by :");
		  System.out.print("\n");
		  System.out.print("     for label press  1: ");
		  System.out.print("\n");
		  System.out.print("     for symbol pres  2: ");
		  System.out.print("\n");
		  int chis;
		  chis = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  switch (chis)
		  {
		  case 1: /// search entry by label
		  {
				String dnm;
				System.out.print(" label : ");
				dnm = ConsoleInput.readToWhiteSpace(true);
				int retp = retPos(dnm, 1);
				if (retp != 0)
				{
					System.out.print("\n");
					System.out.print(" this is in the table");
					System.out.print("\n");
				}
					else
					{
						System.out.print("\n");
						System.out.print(" not in the table");
						System.out.print("\n");
					}
			 break;
		  }
			case 2: /// search entry by symbol
			{
				String dnm;
				System.out.print(" symbol : ");
				dnm = ConsoleInput.readToWhiteSpace(true);
				int retp = retPos(dnm, 2);
				if (retp != 0)
				{

					System.out.print("\n");
					System.out.print(" this is in the table");
					System.out.print("\n");
				}
					else
					{
						 System.out.print("\n");
						 System.out.print(" not in the table");
						 System.out.print("\n");
					}
			 break;
			}
		  }
	}
	public static int Main()
	{

		while (true)
		{
			System.out.print("\nChoose your options: ");
			System.out.print("\n");
			System.out.print("for insert press  1 : ");
			System.out.print("\n");
			System.out.print("for delete press  2 : ");
			System.out.print("\n");
			System.out.print("for modify press  3 : ");
			System.out.print("\n");
			System.out.print("for display press 4 : ");
			System.out.print("\n");
			System.out.print("for search press  5 : ");
			System.out.print("\n");
			System.out.print("for quit  press   0 : ");
			System.out.print("\n");
			System.out.print("\n");
			int option;
			option = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (option == 0)
				break;
			else
			{
				switch (option)
				{
				case 1:
				{
						String nm;
						String id;
						String typ;
						System.out.print("label    : ");
						nm = ConsoleInput.readToWhiteSpace(true);
						System.out.print("symbol   : ");
						id = ConsoleInput.readToWhiteSpace(true);
						System.out.print("address  : ");
						typ = ConsoleInput.readToWhiteSpace(true);
						pos++;
						data[pos].name = nm;
						data[pos].id = id;
						data[pos].type = typ;
						System.out.print("\n");
						System.out.print("entry added.");
						System.out.print("\n");
						break;

				}
				case 2:
				{
						delet();
						System.out.print("\n");
						System.out.print("entry deleted.");
						System.out.print("\n");
						break;

				}
				case 3:
				{
						modify();
						System.out.print("\n");
						System.out.print("entry modified.");
						System.out.print("\n");
						break;

				}
				case 4:
				{
						System.out.print("      label  symbol  address");
						System.out.print("\n");
						System.out.print("------------------------------------");
						System.out.print("\n");
						for (int i = 1;i <= pos;i++)
						{
							System.out.print("      ");
							System.out.print(data[i].name);
							System.out.print("     ");
							System.out.print(data[i].id);
							System.out.print("        ");
							System.out.print(data[i].type);
							System.out.print("\n");
						}
						System.out.print("\n");
						System.out.print("-------------------------------------\ndisplayed.");
						System.out.print("\n");
						break;

				}
				case 5:
				{
						sarch();
						break;
				}
				}
			}
		}
	}
}