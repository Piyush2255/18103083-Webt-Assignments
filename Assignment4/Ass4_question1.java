import java.util.*;
public class Ass4_question1 {

	public static void main(String[] args) {
		try {
		int n, m;
        Scanner input=new Scanner(System.in);
        n= input.nextInt();
        m= input.nextInt();
        input.nextLine(); 
        String[] crops = new String[n];
        for (int i=0;i<n;i++)
        {
            crops[i]=input.nextLine().trim();
        }
        input.close();
        char[][] crops_matrix = new char[n][m];
        for(int i=0; i<n; i++)
        {
            for(int j=0;j<m; j++)
            {
                crops_matrix[i][j] = crops[i].charAt(j);
            }
        }
        char[] crop_types = new char[26];
        for(char c='a'; c<'z'; c++)
        {
            crop_types[c-'a'] = c;
        }
        System.out.println(replant(crops_matrix, 0, 0, n, m, 0, n*m, crop_types));
		}
		catch(Exception e)
		{
			System.out.println("Some Error Occured!");
		}
	}
	public static int replant(char[][] crops_matrix, int current_row, int current_col, int n, int m, int current_count, int minm_count, char[] crop_types)
    {
        Set<Character> left_up = new HashSet<Character>();
        if(current_row!=0)
        {
            left_up.add(crops_matrix[current_row-1][current_col]);
        }
        if(current_col!=0)
        {
            left_up.add(crops_matrix[current_row][current_col-1]);
        }
        Set<Character> right_down = new HashSet<Character>();
        if(current_row!=n-1)
        {
            right_down.add(crops_matrix[current_row+1][current_col]);
        }
        if(current_col!=m-1)
        {
            right_down.add(crops_matrix[current_row][current_col+1]);
        }
        boolean present_left_up = false;
        if(left_up.contains(crops_matrix[current_row][current_col]))
        {
            present_left_up = true;
        }
        char[][] new_crops_mat = new char[n][m];
        if(right_down.contains(crops_matrix[current_row][current_col]))
        {
            if(present_left_up)
            {
                for(int k=0; k<26; k++)
                {
                    if(!left_up.contains(crop_types[k]) && !right_down.contains(crop_types[k]))
                    {
                        for(int i=0; i<n; i++)
                        {
                            for(int j=0;j<m;j++)
                            {
                                new_crops_mat[i][j] = crops_matrix[i][j];
                            }
                        }
                        new_crops_mat[current_row][current_col] = crop_types[k];
                        if(current_col<m-1)
                        {
                            minm_count = Math.min(minm_count, replant(new_crops_mat, current_row, current_col+1, n, m, current_count+1, minm_count, crop_types));
                        }
                        else if(current_row<n-1)
                        {
                            minm_count = Math.min(minm_count, replant(new_crops_mat, current_row+1, 0, n, m, current_count+1, minm_count, crop_types));
                        }
                        else
                        {
                            return Math.min(current_count+1, minm_count);
                        }
                        break;
                    }
                }
            }
            else
            {
                if(current_col<m-1)
                {
                    minm_count = Math.min(minm_count, replant(crops_matrix, current_row, current_col+1, n, m, current_count, minm_count, crop_types));
                }
                else if(current_row<n-1)
                {
                    minm_count = Math.min(minm_count, replant(crops_matrix, current_row+1, 0, n, m, current_count, minm_count, crop_types));
                }
                else
                {
                    return Math.min(current_count, minm_count);
                }
                for(int k=0; k<26;k++)
                {
                    if(!left_up.contains(crop_types[k]) && !right_down.contains(crop_types[k]))
                    {
                        for(int i=0; i<n; i++)
                        {
                            for(int j=0; j<m; j++)
                            {
                                new_crops_mat[i][j] = crops_matrix[i][j];
                            }
                        }
                        new_crops_mat[current_row][current_col] = crop_types[k];
                        if(current_col<m-1)
                        {
                            minm_count = Math.min(minm_count, replant(new_crops_mat, current_row, current_col+1, n, m, current_count+1, minm_count, crop_types));
                        }
                        else if(current_row<n-1)
                        {
                            minm_count = Math.min(minm_count, replant(new_crops_mat, current_row+1, 0, n, m, current_count+1, minm_count, crop_types));
                        }
                        else
                        {
                            return Math.min(current_count+1, minm_count);
                        }
                        break;
                    }
                }

            }
        }
        else
        {
            if(present_left_up)
            {
                for(int k=0; k<26;k++)
                {
                    if(!left_up.contains(crop_types[k]) && !right_down.contains(crop_types[k]))
                    {
                        for(int i=0; i<n; i++)
                        {
                            for(int j=0;j<m;j++)
                            {
                                new_crops_mat[i][j] = crops_matrix[i][j];
                            }
                        }
                        new_crops_mat[current_row][current_col] = crop_types[k];
                        if(current_col<m-1)
                        {
                            minm_count = Math.min(minm_count, replant(new_crops_mat, current_row, current_col+1, n, m, current_count+1, minm_count, crop_types));
                        }
                        else if(current_row<n-1)
                        {
                            minm_count = Math.min(minm_count, replant(new_crops_mat, current_row+1, 0, n, m, current_count+1, minm_count, crop_types));
                        }
                        else
                        {
                            return Math.min(current_count+1, minm_count);
                        }
                        break;
                    }
                }
            }
            else
            {
                if(current_col<m-1)
                {
                    minm_count = Math.min(minm_count, replant(crops_matrix, current_row, current_col+1, n, m, current_count, minm_count, crop_types));
                }
                else if(current_row<n-1)
                {
                    minm_count = Math.min(minm_count, replant(crops_matrix, current_row+1, 0, n, m, current_count, minm_count, crop_types));
                }
                else
                {
                    return Math.min(current_count, minm_count);
                }
            }
        }
        return minm_count;
    }

}
