public int getValueAt(int row, int col)
{
  for(int i = 0; i < entries.length(); i++)
  {
      if(entries.get(i).getRow() == row && entries.get(i).getCol() == col)
      {
        return entries.get(i).getValue();
      }
  }
  return 0;
}
