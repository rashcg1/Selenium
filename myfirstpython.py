from collections import deque

def getindex(s,i):
  if s[i]!='[':
    return -1;
  
  d=deque();
  for k in range (i, len(s)):
    if s[k]==']':
      d.popleft()
    elif s[k]=='[':
     d.append(s[i])
    if not d:
      return k 
  
  return-1

def test(s,i):
  matching_index=getindex(s,i)
  print(s+","+str(i)+","+str(matching_index))
  
def main():
    test("[ABC[23]][89]", 0)
    
if __name__ == "__main__":
	main()